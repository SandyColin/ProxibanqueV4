package fr.formation.proxi4.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.OpinionDao;


@Service
public class OpinionService extends RestService<Opinion> {
	
	@Autowired
	private OpinionDao dao;
	
	protected JpaRepository<Opinion, Integer> getDao() {
		return this.dao;
	}

}
