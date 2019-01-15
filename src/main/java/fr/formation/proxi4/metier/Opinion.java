package fr.formation.proxi4.metier;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
* Bean représentant une opinion laissé par un client lorsqu'il répond à un
* sondage. L'opinion a les attributs id pour identifier l'opinion, isPositive
* pour identifier le statut de l'opinion, le commentaire relatif à l'opinion,
* le client qui a répondu au sondage et le sondage correspondant à l'opinion
* donnée.
*
* @author Adminl
*
*/
@Entity
@Table(name="opinion")
public class Opinion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private Boolean isPositive;
	
	@Column
	private String comment;
	
	
	@OneToOne
	@JoinColumn(name="id_customer", referencedColumnName="id")
	private Customer customer;
	
	
	@ManyToOne
	private Survey survey;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsPositive() {
		return isPositive;
	}

	public void setIsPositive(Boolean isPositive) {
		this.isPositive = isPositive;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	
	
	
}
