package fr.formation.proxi4.presentation.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxi4.metier.Opinion;

@RestController
@RequestMapping("/opinion")
@Transactional(readOnly=true)
@CrossOrigin(origins= {"http:/localhost:4200", "http:/localhost:8080"})
public class OpinionWebService {

	@GetMapping("/{id}")
	public Opinion createOpinion(@PathVariable Opinion opinion) {
		
		return null;
	}
}
