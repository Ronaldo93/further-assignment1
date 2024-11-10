package model;

import java.util.ArrayList;

public class CommercialProperty extends Property {
	// attributes: property that facilitates business activities
	// e.g. business type, parking spaces, and square footage, etc.

	private String businessType;
	private int parkingSpaces;
	private int squareFootage;

	public CommercialProperty() {
		super();
		this.businessType = "";
		this.parkingSpaces = 0;
		this.squareFootage = 0;
	}

	public CommercialProperty(String propertyId, String address, PropertyStatus status, Person owner,String businessType, int parkingSpaces, int squareFootage) {
		super(propertyId, address, status, owner);
		this.businessType = businessType;
		this.parkingSpaces = parkingSpaces;
		this.squareFootage = squareFootage;
	}

	// getter and setter
	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public int getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(int parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}
}
