package model;

import java.util.ArrayList;

public class Persons {
	private ArrayList<Person> personsList;  // slowly deprecating

	// list of persons with different roles
	private ArrayList<Tenant> tenantsList;
	private ArrayList<Host> hostsList;
	private ArrayList<Owner> ownersList;

	public Persons() {
		this.personsList = new ArrayList<Person>();
	}

	/**
	 * Add a person to the list of persons
	 * @param person person to add
	 */
	public void addPerson(Person person) {
		this.personsList.add(person);
	}

	public ArrayList<Person> getPersonsList() {
		return personsList;
	}

	public void setPersonsList(ArrayList<Person> personsList) {
		this.personsList = personsList;
	}

	// getters and setters

	public ArrayList<Tenant> getTenantsList() {
		return tenantsList;
	}

	public void setTenantsList(ArrayList<Tenant> tenantsList) {
		this.tenantsList = tenantsList;
	}

	public ArrayList<Host> getHostsList() {
		return hostsList;
	}

	public void setHostsList(ArrayList<Host> hostsList) {
		this.hostsList = hostsList;
	}

	public ArrayList<Owner> getOwnersList() {
		return ownersList;
	}

	public void setOwnersList(ArrayList<Owner> ownersList) {
		this.ownersList = ownersList;
	}
}
