package fr.formation.proxi4.metier;



import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.proxi4.persistance.CustomerDao;



public class CustomerService extends RestService<Customer> {
	
	private CustomerDao dao;
	
	protected JpaRepository<Customer, Integer> getDao() {
		return this.dao;
	}
	
	public Integer getCustomerIdByClientNumber(String clientNumber) {
		return this.dao.findByClient_Number(clientNumber).getId();
	}

}
