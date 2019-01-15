package fr.formation.proxi4.metier;

import java.time.LocalDate;

public class ResponseSurvey {
	
	public Integer nbPos;
	
	public Integer nbNeg;
	
	public LocalDate openDate;
	
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
