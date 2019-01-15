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
<<<<<<< HEAD
import fr.formation.proxi4.metier.OpinionService;
=======
import fr.formation.proxi4.ProxiConstants;
>>>>>>> 15da8aa0810ef5c3069f4537bf73d2a022589b8a
import fr.formation.proxi4.metier.Survey;


@Controller
@RequestMapping("/")
@Transactional(readOnly=true)
public class ViewController {

	private static final Logger LOGGER = Logger.getLogger(ViewController.class);
	
	@Autowired
	private SurveyService surveyService;
	
	@Autowired
	private OpinionService opinionService;
	
	@RequestMapping({ "", "index" })
	public ModelAndView index(@RequestParam(required = false) String message) {
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
	public ModelAndView showSurveys() {
		LOGGER.debug("Vous entrez sur la page sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("surveys");
		mav.addObject("surveys", this.surveyService.readAll());
		mav.addObject("responseSurvey", this.opinionService.getAllOpinions());
		return mav;
	}
	
//	@RequestMapping("survey")
//	public ModelAndView loadSurvey(Integer id) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("survey");
//		Survey survey = this.surveyService.read(id);
//		Hibernate.initialize(survey);
//		mav.addObject("survey", survey);
//		return mav;
//	}
	
	@RequestMapping("form")
	public ModelAndView create() { 
		LOGGER.debug(
				"Formulaire de création d'un sondage");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		mav.addObject("survey", new Survey());
		LOGGER.debug(
				"Formulaire de création d'un sondage");
		return mav;
	}
	
	/**@RequestMapping(path = "form", method = RequestMethod.POST)
	public String createForm(Survey survey, RedirectAttributes attributes) {
		String message = null;
		this.surveyService.create(survey);	
		message = "Sondage bien ajouté !";	
		attributes.addFlashAttribute("message", message);
		return ProxiConstants.REDIRECT_TO_INDEX;
	}
	*/
			@RequestMapping(path = "form", method = RequestMethod.POST)
			    public String createForm(String startingDate, String provisionalDate, RedirectAttributes attributes ) {
			        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			        LocalDate dt1 = LocalDate.parse(startingDate, dtf);
			        LocalDate dt2 = LocalDate.parse(provisionalDate, dtf);
			        
			        
			        //ModelAndView mav = new ModelAndView("createsurvey");
			        Survey survey = new Survey();
			        survey.setStartingDate(dt1);
			        survey.setProvisionalDate(dt2);
			        this.surveyService.create(survey);
			        String message = "Sondage bien ajouté !";	
					attributes.addFlashAttribute("message", message);
			        return ProxiConstants.REDIRECT_TO_INDEX;
			    }
	
	
//	@RequestMapping("close")
//	public String closeCurrentSurvey(Integer id, RedirectAttributes attributes) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("close");
//		Survey survey = this.surveyService.read(id);
//		Hibernate.initialize(survey);
//		survey.setCloseDate(LocalDate.now());
//		this.surveyService.update(survey);
//		return ProxiConstants.REDIRECT_TO_INDEX;
//	}
	
	//@RequestMapping(path = "index", method = RequestMethod.POST)
	@RequestMapping("close")
	public String closeCurrentSurvey(@RequestParam Integer id, RedirectAttributes attributes) {
		
		Survey survey = this.surveyService.read(id);
		survey.setCloseDate(LocalDate.now());
		this.surveyService.update(survey);
		String message = "Le sondage a bien été cloturé à la date du jour !";	
		attributes.addFlashAttribute("message", message);
		return ProxiConstants.REDIRECT_TO_INDEX;
	}
}
