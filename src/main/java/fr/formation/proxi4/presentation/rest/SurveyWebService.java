package fr.formation.proxi4.presentation.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/survey")
@Transactional(readOnly=true)
@CrossOrigin(origins= {"http:/localhost:4200", "http:/localhost:8080"})
public class SurveyWebService {

	@GetMapping("/{id}")
	public Boolean checkSurvey() {
		
		return null;
	}
}
