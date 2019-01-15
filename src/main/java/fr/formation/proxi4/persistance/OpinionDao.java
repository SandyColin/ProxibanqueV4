package fr.formation.proxi4.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxi4.metier.Opinion;
/**
* Classe permettant la persistance des données de la réponse à un sondage.
*
* @author Adminl
*
*/
@Repository
public interface OpinionDao extends JpaRepository<Opinion, Integer> {

}
