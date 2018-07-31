package com.startup.daddyschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "academic_facilities")
@EntityListeners(AuditingEntityListener.class)
public class AcademicsFacilitiesEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3207544789490386625L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
	
	@Column(name = "science_lab")
	private boolean scienceLab;
	
	@Column(name = "maths_lab")
	private boolean mathsLab;
	
	@Column(name = "language_lab")
	private boolean languageLab;
	
	@Column(name = "library")
	private boolean library;
	
	@Column(name = "smart_class_room")
	private boolean smartClassRoom;

	public boolean isScienceLab() {
		return scienceLab;
	}

	public void setScienceLab(boolean scienceLab) {
		this.scienceLab = scienceLab;
	}

	public boolean isMathsLab() {
		return mathsLab;
	}

	public void setMathsLab(boolean mathsLab) {
		this.mathsLab = mathsLab;
	}

	public boolean isLanguageLab() {
		return languageLab;
	}

	public void setLanguageLab(boolean languageLab) {
		this.languageLab = languageLab;
	}

	public boolean isLibrary() {
		return library;
	}

	public void setLibrary(boolean library) {
		this.library = library;
	}

	public boolean isSmartClassRoom() {
		return smartClassRoom;
	}

	public void setSmartClassRoom(boolean smartClassRoom) {
		this.smartClassRoom = smartClassRoom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
