package fr.formation.proxi4.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxi4.metier.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	Customer findByClientNumber(String clientNumber);
	
}
