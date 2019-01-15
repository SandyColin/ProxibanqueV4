package fr.formation.proxi4.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.formation.proxi4.metier.SurveyService;

import fr.formation.proxi4.metier.OpinionService;

import fr.formation.proxi4.ProxiConstants;

import fr.formation.proxi4.metier.Survey;

/**
 * Classe comprenant les méthodes de traitement des pages d'affichage
 *
 * @author Adminl
 *
 */
@Controller
@RequestMapping("/")
@Transactional(readOnly = true)
public class ViewController {

	private static final Logger LOGGER = Logger.getLogger(ViewController.class);

	@Autowired
	private SurveyService surveyService;

	@Autowired
	private OpinionService opinionService;

	/**
	 * Méthode permettant l'affichage de la page d'accueil
	 *
	 * @param request
	 * @param message
	 * @return
	 */
	@RequestMapping({ "", "index" })
	public ModelAndView index(@RequestParam(required = false) String message) {
		LOGGER.debug("Page d'accueil index !");
		LOGGER.debug("Message récupéré après redirection ? '" + message + "'");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		Survey currentSurvey = this.surveyService.getCurrentSurvey();
		mav.addObject("survey", currentSurvey);
		return mav;
	}

	/**
	 * Méthode permettant l'affichage de la page des sondages.
	 *
	 * @return
	 */
	@RequestMapping("surveys")
	public ModelAndView showSurveys() {
		LOGGER.debug("Vous entrez sur la page sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("surveys");
		mav.addObject("surveys", this.surveyService.readAll());
		mav.addObject("responseSurvey", this.opinionService.getAllOpinions());
		return mav;
	}

	/**
	 * Méthode permettant l'affichage de la page de création d'un sondage.
	 *
	 * @return
	 */
	@RequestMapping("form")
	public ModelAndView create() {
		LOGGER.debug("Formulaire de création d'un sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		mav.addObject("survey", new Survey());
		LOGGER.debug("Formulaire de création d'un sondage");
		return mav;
	}

	
	/**
	 * Méthode permettant la récupération et le traitement des informations
	 * relatives à la création d'un sondage.
	 *
	 * @param survey
	 * @param attributes
	 * @return
	 */
	@RequestMapping(path = "form", method = RequestMethod.POST)
	public String createForm(String startingDate, String provisionalDate, RedirectAttributes attributes) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dt1 = LocalDate.parse(startingDate, dtf);
		LocalDate dt2 = LocalDate.parse(provisionalDate, dtf);

		// ModelAndView mav = new ModelAndView("createsurvey");
		Survey survey = new Survey();
		survey.setStartingDate(dt1);
		survey.setProvisionalDate(dt2);
		this.surveyService.create(survey);
		String message = "Sondage bien ajouté !";
		attributes.addFlashAttribute("message", message);
		return ProxiConstants.REDIRECT_TO_INDEX;
	}


	/**
	 * Méthode permettant de cloturer un sondage.
	 *
	 * @param id
	 * @param attributes
	 * @return
	 */
	@RequestMapping("close")
	public String closeCurrentSurvey(@RequestParam Integer id, RedirectAttributes attributes) {

		Survey survey = this.surveyService.read(id);
		survey.setCloseDate(LocalDate.now());
		this.surveyService.update(survey);
		String message = "Le sondage a été cloturé à la date du jour !";
		attributes.addFlashAttribute("message", message);
		return ProxiConstants.REDIRECT_TO_INDEX;
	}
}
