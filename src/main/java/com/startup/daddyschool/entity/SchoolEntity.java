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
@Table(name = "school")
@EntityListeners(AuditingEntityListener.class)

public class SchoolEntity implements Serializable {
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

}