package fr.formation.proxi4.presentation;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.proxi4.metier.SurveyService;
import fr.formation.proxi4.metier.Survey;

@Controller
@RequestMapping("/")
public class ViewController {

	private static final Logger LOGGER = Logger.getLogger(ViewController.class);
	
	@Autowired
	private SurveyService surveyService;
	
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
}
