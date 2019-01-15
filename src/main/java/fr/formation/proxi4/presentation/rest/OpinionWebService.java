package fr.formation.proxi4.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxi4.metier.Opinion;
import fr.formation.proxi4.metier.OpinionService;

@RestController
@RequestMapping("/opinion")
@Transactional(readOnly=true)
@CrossOrigin(origins= {"http://localhost:4200", "http://localhost:8080"})
public class OpinionWebService {
	
	@Autowired
	private OpinionService opinionService;
	
	@PostMapping
	public Opinion createOpinion(@RequestBody Opinion opinion) {
		return this.opinionService.create(opinion);
		
	}
}
