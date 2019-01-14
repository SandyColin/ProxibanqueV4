package fr.formation.proxi4.metier;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.CustomerDao;


@Service
public class CustomerService extends RestService<Customer> {
	
	@Autowired
	private CustomerDao dao;
	
	protected JpaRepository<Customer, Integer> getDao() {
		return this.dao;
	}
	
	public Integer getCustomerIdByClientNumber(String clientNumber) {
		return this.dao.findByClient_Number(clientNumber).getId();
	}

}
