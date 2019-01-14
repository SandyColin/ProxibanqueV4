package fr.formation.proxi4.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.SurveyDao;


@Service
public class SurveyService extends RestService<Survey> {
	@Autowired
	private SurveyDao dao;
	
	protected JpaRepository<Survey, Integer> getDao() {
		return this.dao;
	}

}
