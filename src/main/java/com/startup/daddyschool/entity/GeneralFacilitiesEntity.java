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
@Table(name = "general_facilities")
@EntityListeners(AuditingEntityListener.class)
public class GeneralFacilitiesEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5574816764929161167L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
	
	@Column(name = "canteen")
	private boolean canteen;
	
	@Column(name = "doctor")
	private boolean doctor;
	
	@Column(name = "transport")
	private boolean transport;
	
	@Column(name = "transport_with_gps")
	private boolean transportWithGps;
	
	@Column(name = "cctv")
	private boolean cctv;

	public boolean isCanteen() {
		return canteen;
	}

	public void setCanteen(boolean canteen) {
		this.canteen = canteen;
	}

	public boolean isDoctor() {
		return doctor;
	}

	public void setDoctor(boolean doctor) {
		this.doctor = doctor;
	}

	public boolean isTransport() {
		return transport;
	}

	public void setTransport(boolean transport) {
		this.transport = transport;
	}

	public boolean isTransportWithGps() {
		return transportWithGps;
	}

	public void setTransportWithGps(boolean transportWithGps) {
		this.transportWithGps = transportWithGps;
	}

	public boolean isCctv() {
		return cctv;
	}

	public void setCctv(boolean cctv) {
		this.cctv = cctv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
