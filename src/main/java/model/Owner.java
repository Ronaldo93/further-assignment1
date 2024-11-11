package model;

import java.util.ArrayList;
import java.util.Date;

public class Owner extends Person {
	private ArrayList<Property> propertiesList;
	private ArrayList<Host> hostList;

	// Constructor
	public Owner() {
		propertiesList = new ArrayList<Property>();
		hostList = new ArrayList<Host>();
	}

	public Owner(int id, String name, Date dateOfBirth, String number) {
		super(id, name, dateOfBirth, number);
		propertiesList = new ArrayList<Property>();
		hostList = new ArrayList<Host>();
	}

	/**
	 * Add property to the owner
	 * @param property Property to be added
	 */
	public void addProperty(Property property) {
		propertiesList.add(property);
	}

	/**
	 * Add host to the owner
	 * @param host Host to be added
	 */
	public void addHost(Host host) {
		hostList.add(host);
	}

	// getter and setter
	public ArrayList<Property> getPropertiesList() {
		return propertiesList;
	}

	public void setPropertiesList(ArrayList<Property> propertiesList) {
		this.propertiesList = propertiesList;
	}

	public ArrayList<Host> getHostList() {
		return hostList;
	}

	public void setHostList(ArrayList<Host> hostList) {
		this.hostList = hostList;
	}
}
