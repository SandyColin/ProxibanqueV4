package fr.formation.proxi4.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxi4.metier.Customer;
import fr.formation.proxi4.metier.CustomerService;

/**
 * Classe permettant la liaison entre le backend et le frontend d'un objet
 * opinion.
 *
 * @author Adminl
 *
 */
@RestController
@RequestMapping("/customer")
@Transactional(readOnly = true)
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:8080" })
public class CustomerWebService {

	@Autowired
	private CustomerService customerService;

	/**
	 * Méthode permettant de retourner un client via son numéroClient
	 *
	 * @return client de type Customer
	 */
	@GetMapping("/{clientNumber}")
	public Customer checkCustomer(@PathVariable String clientNumber) {
		Integer clientId=this.customerService.getCustomerIdByClientNumber(clientNumber);
		Customer client = null;
		if (clientId != null) {
		client= this.customerService.read(clientId);
		} 
		return client; 
	}


}
