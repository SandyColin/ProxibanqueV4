package fr.formation.proxi4.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxi4.metier.Survey;

@Repository
public interface SurveyDao extends JpaRepository<Survey, Integer> {

}
