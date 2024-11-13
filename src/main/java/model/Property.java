package model;

import java.util.ArrayList;


public class Property {
	private int propertyId;

	// property detail
	private java.lang.String address;
	// private double pricing;
	private PropertyStatus status;

	// property management
	private int ownerId;
	private ArrayList<Integer> hostIds;

	public Property() {}

	public Property(int propertyId, String address, PropertyStatus status, int ownerId, ArrayList<Integer> hostIds) {
		this.propertyId = propertyId;
		this.address = address;
		this.status = status;
		this.ownerId = ownerId;
		this.hostIds = hostIds;
	}

	// getter and setter

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PropertyStatus getStatus() {
		return status;
	}

	public void setStatus(PropertyStatus status) {
		this.status = status;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public ArrayList<Integer> getHostIds() {
		return hostIds;
	}

	public void setHostIds(ArrayList<Integer> hostIds) {
		this.hostIds = hostIds;
	}
}