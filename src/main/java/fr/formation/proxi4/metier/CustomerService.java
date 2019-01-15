package fr.formation.proxi4.metier;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.CustomerDao;

/**
* Classe permettant la communication entre un objet client et la DAO.
*
* @author Adminl
*
*/
@Service
public class CustomerService extends RestService<Customer> {
	
	@Autowired
	private CustomerDao dao;
	
	protected JpaRepository<Customer, Integer> getDao() {
		return this.dao;
	}
	 /**
     * Méthode permettant de récupérer l'id d'un client par son numéro de banque.
     *
     * @param clientNumber
     * @return
     */
	public Integer getCustomerIdByClientNumber(String clientNumber) {
		return this.dao.findByClientNumber(clientNumber).getId();
	}

}
