package fr.formation.proxi4.presentation;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(path = "create", method = RequestMethod.POST)
	public ModelAndView createForm(Integer id, Date startingDate, Date previsionalDate, Date closeDate) {
		ModelAndView mav = new ModelAndView("create");	
		Survey survey = this.surveyService.read(id);
		survey.setStartingDate(startingDate);
		survey.setStartingDate(previsionalDate);
		survey.setStartingDate(closeDate);		
		this.surveyService.create(survey);		
		mav.addObject("survey", survey);
		return mav;
	}
	
	@RequestMapping("close")
	public ModelAndView closeCurrentSurvey(Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("close");
		Survey survey = this.surveyService.read(id);
		Hibernate.initialize(survey);
		mav.addObject("survey", survey);
		mav.addObject("isEdit", true);
		return mav;
	}
}
