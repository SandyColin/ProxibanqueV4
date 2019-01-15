package fr.formation.proxi4.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxi4.metier.Customer;
import fr.formation.proxi4.metier.CustomerService;


@RestController
@RequestMapping("/customer")
@Transactional(readOnly=true)
@CrossOrigin(origins= {"http://localhost:4200", "http://localhost:8080"})
public class CustomerWebService {

	
	private CustomerService customerService;
	
	@GetMapping
	public Customer checkCustomer(@RequestParam String clientNumber) {
		
		return this.customerService.getCustomerIdByClientNumber(clientNumber); //Mettre en Integer le retour ou changer le retour
	}
}
