package fr.formation.proxi4.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.proxi4.persistance.OpinionDao;



public class OpinionService extends RestService<Opinion> {
	
	private OpinionDao dao;
	
	protected JpaRepository<Opinion, Integer> getDao() {
		return this.dao;
	}

}
