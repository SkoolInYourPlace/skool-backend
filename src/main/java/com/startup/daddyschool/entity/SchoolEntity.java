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
import org.springframework.web.bind.annotation.Mapping;

@Entity
@Table(name = "school")
@EntityListeners(AuditingEntityListener.class)

public class SchoolEntity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4355438311463708072L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="Name",nullable = false, updatable = false)
    private String name;

	@Column(name = "Address", nullable = false)
	private String address;

	@Column(name = "Name_of_Principal")
	private String principalName;

	@Column(name = "Contact")
	private String contactNo;

	@Column(name = "Medium")
	private String medium;

	@Column(name = "Syllabus")
	private String syllabus;

	@Column(name = "Classes")
	private String classes;

	@Column(name = "Timing")
	private String timing;

	@Column(name = "Weekly_Off")
	private String weeklyOff;
	
	@Column(name = "Result_Percent")
	private int resultPerecnt;

	@Column(name = "Website")
	private String webSite;
	
	@Column(name = "Licence_No")
	private String licenceNo;

	@Column(name = "Affiliation_Status")
	private String affiliationStatus;

	@Column(name = "No_Of_Branches")
	private int noOfBranches;

	@Column(name = "Admission_Transferrable")
	private boolean admissionTransfferable;

	@JoinColumn(name = "facilities")
	@OneToOne(cascade = CascadeType.ALL)
	FacilitiesEntity facilities;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getWeeklyOff() {
		return weeklyOff;
	}

	public void setWeeklyOff(String weeklyOff) {
		this.weeklyOff = weeklyOff;
	}

	public int getResultPerecnt() {
		return resultPerecnt;
	}

	public void setResultPerecnt(int resultPerecnt) {
		this.resultPerecnt = resultPerecnt;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getAffiliationStatus() {
		return affiliationStatus;
	}

	public void setAffiliationStatus(String affiliationStatus) {
		this.affiliationStatus = affiliationStatus;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public boolean isAdmissionTransfferable() {
		return admissionTransfferable;
	}

	public void setAdmissionTransfferable(boolean admissionTransfferable) {
		this.admissionTransfferable = admissionTransfferable;
	}

	public FacilitiesEntity getFacilities() {
		return facilities;
	}

	public void setFacilities(FacilitiesEntity facilities) {
		this.facilities = facilities;
	}
	
}