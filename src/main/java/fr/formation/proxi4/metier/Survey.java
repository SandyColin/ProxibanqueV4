package fr.formation.proxi4.metier;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="survey")
@JsonIgnoreProperties({"hibernateLazyInitializer" , "handler" , "opinions"})
public class Survey {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private LocalDate startingDate;
	
	@Column
	private LocalDate provisionalDate;
	
	@Column
	private LocalDate closeDate;
	
	
	@OneToMany(mappedBy= "survey")
	private List<Opinion> opinions;
	
	
	
	

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	} 

	public LocalDate getProvisionalDate() {
		return provisionalDate;
	}

	public void setProvisionalDate(LocalDate provisionalDate) {
		this.provisionalDate = provisionalDate;
	}

	public LocalDate getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}

	public List<Opinion> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}

	
	
	
}
