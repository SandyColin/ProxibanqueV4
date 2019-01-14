package fr.formation.proxi4.presentation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.proxi4.metier.SurveyService;

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
		mav.addObject("surveys", this.surveyService.readAll();
		return mav;
	}
}
