package com.gojek.parking.model.data;

public class Vehicle {

	private String registrationNumber;
	private String color;
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public Vehicle(String registrationNumber, String color) {
		super();
		this.registrationNumber = registrationNumber;
		this.color = color;
	}
}
