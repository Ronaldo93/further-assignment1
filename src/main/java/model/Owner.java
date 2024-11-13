package model;

import java.util.ArrayList;
import java.util.Date;

public class Owner extends Person {
	private ArrayList<Integer> propertiesList;
	private ArrayList<Integer> hostList;

	// Constructor
	public Owner() {
		propertiesList = new ArrayList<Integer>();
		hostList = new ArrayList<Integer>();
	}

	public Owner(int id, java.lang.String name, Date dateOfBirth, java.lang.String number) {
		super(id, name, dateOfBirth, number);
		propertiesList = new ArrayList<Integer>();
		hostList = new ArrayList<Integer>();
	}

	/**
	 * Add property to the owner
	 * @param property Property to be added
	 */
	public void addProperty(Property property) {
		propertiesList.add(property.getPropertyId());
	}

	/**
	 * Add host to the owner
	 * @param host Host to be added
	 */
	public void addHost(Host host) {
		hostList.add(host.getId());
	}

	// getter and setter
	public ArrayList<Integer> getPropertiesList() {
		return propertiesList;
	}

	public void setPropertiesList(ArrayList<Integer> propertiesList) {
		this.propertiesList = propertiesList;
	}

	public ArrayList<Integer> getHostList() {
		return hostList;
	}

	public void setHostList(ArrayList<Integer> hostList) {
		this.hostList = hostList;
	}
}
