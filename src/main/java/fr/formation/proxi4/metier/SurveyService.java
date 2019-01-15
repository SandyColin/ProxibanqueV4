package fr.formation.proxi4.metier;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.SurveyDao;

/**
* Classe permettant de lier un objet sondage à la DAO. Elle comprends les
* traitements métier du sondage.
*
* @author Adminl
*
*/
@Service
public class SurveyService extends RestService<Survey> {
	@Autowired
	private SurveyDao dao;
	
	protected JpaRepository<Survey, Integer> getDao() {
		return this.dao;
	}
	/**
	* Méthode permettant de retourner le sondage en cours
    *
    * @return survey de type Survey
    */
	public Survey getCurrentSurvey() {
		List<Survey> surveys = this.readAll();
		Survey currentSurvey = null;
		for(Survey survey: surveys) {
			if(survey.getCloseDate() == null && LocalDate.now().isAfter(survey.getStartingDate())) {
				
				currentSurvey = survey;
			}
		}
		return currentSurvey;
	}

}
