package model;

import java.util.ArrayList;

public class Properties {
	private ArrayList<Property> stringList;

	public Properties() {
		this.stringList = new ArrayList<Property>();
	}

	/**
	 * Add property to property list
	 * @param string - the property to be added
	 */
	public void addProperty(Property string) {
		this.stringList.add(string);
	}
}
