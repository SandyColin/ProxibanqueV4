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
/**
* Classe permettant la liaison entre le backend et le frontend d'un objet
* opinion.
*
* @author Adminl
*
*/
@RestController
@RequestMapping("/opinion")
@Transactional(readOnly=true)
@CrossOrigin(origins= {"http://localhost:4200", "http://localhost:8080"})
public class OpinionWebService {
	
	@Autowired
	private OpinionService opinionService;
	/**
	* Méthode permettant de créer un avis dans la BDD via le Web Service
    *
    * @return opinion de type Opinion
    */
	@PostMapping
	public Opinion createOpinion(@RequestBody Opinion opinion) {
		return this.opinionService.create(opinion);
		
	}
}
