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

}
