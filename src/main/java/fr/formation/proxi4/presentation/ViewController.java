package fr.formation.proxi4.presentation;

import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.formation.proxi4.metier.SurveyService;
import fr.formation.proxi4.metier.Survey;

@Controller
@RequestMapping("/")
public class ViewController {

	private static final Logger LOGGER = Logger.getLogger(ViewController.class);
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping({ "", "index" })
	public ModelAndView index(HttpServletRequest request,
			@RequestParam(required = false) String message) {
		LOGGER.debug("Page d'accueil index !");
		LOGGER.debug("Message récupéré après redirection ? '" + message + "'");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("message", message);
		Survey currentSurvey = this.surveyService.getCurrentSurvey();
		mav.addObject("survey", currentSurvey);
		return mav;
	}
	
	@RequestMapping("surveys")
	public ModelAndView loadSurveys() {
		LOGGER.debug("Vous entrez sur la page sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("surveys");
		mav.addObject("surveys", this.surveyService.readAll());
		return mav;
	}
	
	@RequestMapping("survey")
	public ModelAndView showSurvey(Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("survey");
		Survey survey = this.surveyService.read(id);
		Hibernate.initialize(survey);
		mav.addObject("survey", survey);
		return mav;
	}
	
	@RequestMapping("form")
	public ModelAndView create() { 
		LOGGER.debug(
				"Formulaire de création d'un sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		mav.addObject("survey", new Survey());
		return mav;
	}
	
	@RequestMapping(path = "form", method = RequestMethod.POST)
	public String createForm(Survey survey, RedirectAttributes attributes) {
		String message = null;
		this.surveyService.create(survey);	
		message = "Sondage bien ajouté !";	
		attributes.addFlashAttribute("message", message);
		return "redirect:/index.html";
	}
	
	
	@RequestMapping("close")
	public String closeCurrentSurvey(Integer id, RedirectAttributes attributes) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("close");
		Survey survey = this.surveyService.read(id);
		Hibernate.initialize(survey);
		survey.setCloseDate(LocalDate.now());
		this.surveyService.update(survey);
		return "redirect:/index.html";
	}
}
