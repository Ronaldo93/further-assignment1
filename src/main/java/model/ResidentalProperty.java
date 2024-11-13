package model;

import java.util.ArrayList;

public class ResidentalProperty extends Property {
	// attributes: information of the property
	// e.g. the number of bedrooms, garden availability, or pet-friendliness, etc.

	private int numberOfBedrooms;
	private boolean hasGarden;
	private boolean isPetFriendly;

	public ResidentalProperty() {
		super();
		this.numberOfBedrooms = 0;
		this.hasGarden = false;
		this.isPetFriendly = false;
	}

	public ResidentalProperty(int propertyId, java.lang.String address, PropertyStatus status, int owner, int numberOfBedrooms, boolean hasGarden, boolean isPetFriendly) {
		super(propertyId, address, status, owner, new ArrayList<Integer>());
		this.numberOfBedrooms = numberOfBedrooms;
		this.hasGarden = hasGarden;
		this.isPetFriendly = isPetFriendly;
	}

	// getter and setter
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public boolean isHasGarden() {
		return hasGarden;
	}

	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}

	public boolean isPetFriendly() {
		return isPetFriendly;
	}

	public void setPetFriendly(boolean petFriendly) {
		isPetFriendly = petFriendly;
	}
}
