package com.startup.daddyschool.maps.entity;

import java.util.StringJoiner;

public class GeographicalAdress {
	String latitude;
	String longitude;
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public GeographicalAdress(String latitude, String longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringJoiner joiner= new StringJoiner(",");
		 joiner.add(latitude);
		 joiner.add(longitude);
		 return joiner.toString();
	}
	 

}
