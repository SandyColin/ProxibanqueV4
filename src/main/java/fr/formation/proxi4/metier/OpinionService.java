package fr.formation.proxi4.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxi4.persistance.OpinionDao;
import fr.formation.proxi4.persistance.SurveyDao;

/**
 * Classe permettant la communication entre un objet opinion et la DAO. Elle
 * comprends les traitements métier du client.
 *
 *
 * @author Adminl
 *
 */
@Service
public class OpinionService extends RestService<Opinion> {

	@Autowired
	private OpinionDao dao;

	@Autowired
	private SurveyDao surveyDao;

	protected JpaRepository<Opinion, Integer> getDao() {
		return this.dao;
	}

	/**
	 * Méthode permettant d'obtenir une liste des avis d'un sondage
	 * 
	 * @return une liste de ResponseSurvey
	 */
	public List<ResponseSurvey> getAllOpinions() {
		List<ResponseSurvey> responseSurveys = new ArrayList<>();
		List<Survey> surveys = this.surveyDao.findAll();
		for (Survey survey : surveys) {
			ResponseSurvey responseSurvey = new ResponseSurvey();
			responseSurvey.setOpenDate(survey.getStartingDate());
			responseSurvey.setEndDate(survey.getCloseDate());
			responseSurveys.add(responseSurvey);
			responseSurvey.setNbNeg(this.countNegative(survey.getOpinions()));
			responseSurvey.setNbPos(this.countPositive(survey.getOpinions()));
		}
		return responseSurveys;
	}

	/**
	 * Methode permettant de calculer le nombre d'avis positifs pour un sondage
	 * donné
	 * 
	 * @param opinions
	 * @return Integer
	 */
	protected Integer countPositive(List<Opinion> opinions) {
		Integer nbP = 0;
		for (Opinion opinion : opinions) {
			if (opinion.getIsPositive()) {
				nbP++;
			}
		}
		return nbP;
	}

	/**
	 * Methode permettant de calculer le nombre d'avis negatifs pour un sondage
	 * donné
	 * 
	 * @param opinions
	 * @return Integer
	 */
	protected Integer countNegative(List<Opinion> opinions) {
		Integer nbN = 0;
		for (Opinion opinion : opinions) {
			if (!opinion.getIsPositive()) {
				nbN++;
			}
		}
		return nbN;
	}

}
