package fr.formation.proxi4.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Définition commune pour les services utilisés par les services web REST.
 *
 * @author Adminl
 *
 * @param <ENTITY>
 */
public abstract class RestService<ENTITY> {
	/**
	 * @return JpaRepository<ENTITY, Integer> le DAO a utiliser pour effectuer
	 *         l'accès BDD.
	 */
	protected abstract JpaRepository<ENTITY, Integer> getDao();

	/**
	 * Création d'une entité dans la BDD
	 * 
	 * @param entity
	 * @return une entité de type ENTITY
	 */
	public ENTITY create(final ENTITY entity) {
		return this.getDao().save(entity);
	}

	/**
	 * Permet de lire les informations d'une seule entité grâce à son id
	 * 
	 * @param id
	 * @return entity de type ENTITY
	 */
	public ENTITY read(final Integer id) {
		return this.getDao().getOne(id);
	}

	/**
	 * Lecture de la liste des Entités
	 * 
	 * @return une liste d'entités
	 */
	public List<ENTITY> readAll() {
		return this.getDao().findAll();
	}

	/**
	 * Mise à jour d'une entité
	 * 
	 * @param entity
	 * @return enity de type ENTITY
	 */
	public ENTITY update(final ENTITY entity) {
		return this.getDao().save(entity);
	}

	/**
	 * Suppression via l'id d'une entité de la BDD
	 * 
	 * @param id
	 */
	public void delete(final Integer id) {
		this.getDao().deleteById(id);
	}

}
