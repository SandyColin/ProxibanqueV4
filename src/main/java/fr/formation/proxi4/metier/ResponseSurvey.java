package fr.formation.proxi4.metier;

import java.time.LocalDate;
/**
* Bean représentant une opinion laissé par un client lorsqu'il répond à un
* sondage. L'opinion a les attributs nbPos pour compter le nombre d'avis positifs, 
* nbNeg pour compter le nombre d'avis négatifs, 
* la date de démarrage du sondage.
*
* @author Adminl
*
*/
public class ResponseSurvey {
	
	public Integer nbPos;
	
	public Integer nbNeg;
	
	public LocalDate openDate;
	
	public LocalDate endDate;
	
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Integer getNbPos() {
		return nbPos;
	}

	public void setNbPos(Integer nbPos) {
		this.nbPos = nbPos;
	}

	public Integer getNbNeg() {
		return nbNeg;
	}

	public void setNbNeg(Integer nbNeg) {
		this.nbNeg = nbNeg;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

}
