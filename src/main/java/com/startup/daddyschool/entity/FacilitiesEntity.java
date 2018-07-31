package com.startup.daddyschool.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "facilities")
@EntityListeners(AuditingEntityListener.class)
public class FacilitiesEntity implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1797164990164659864L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
	
	@JoinColumn(name = "sports")
	@OneToOne(cascade = CascadeType.ALL)
	SportsFacilitiesEntity sports;
	
	@JoinColumn(name = "academics")
	@OneToOne(cascade = CascadeType.ALL)
	AcademicsFacilitiesEntity academics;
	
	@JoinColumn(name = "general")
	@OneToOne(cascade = CascadeType.ALL)
	GeneralFacilitiesEntity general;

	public SportsFacilitiesEntity getSports() {
		return sports;
	}

	public void setSports(SportsFacilitiesEntity sports) {
		this.sports = sports;
	}

	public AcademicsFacilitiesEntity getAcademics() {
		return academics;
	}

	public void setAcademics(AcademicsFacilitiesEntity academics) {
		this.academics = academics;
	}

	public GeneralFacilitiesEntity getGeneral() {
		return general;
	}

	public void setGeneral(GeneralFacilitiesEntity general) {
		this.general = general;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
