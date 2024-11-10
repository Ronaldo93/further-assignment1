package model;

import java.util.ArrayList;

public class Properties {
	private ArrayList<Property> propertyList;

	public Properties() {
		this.propertyList = new ArrayList<Property>();
	}

	/**
	 * Add property to property list
	 * @param property - the property to be added
	 */
	public void addProperty(Property property) {
		this.propertyList.add(property);
	}
}
