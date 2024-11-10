package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Host extends Person{
	private ArrayList<Property> propertyList;
	private ArrayList<Person> ownerList;

	public Host() {
		super();
		this.propertyList = new ArrayList<Property>();
		this.ownerList = new ArrayList<Person>();
	}

	public Host(int id, String name, Date dateOfBirth, String number, ArrayList<Property> propertyList, ArrayList<Person> ownerList) {
		super(id, name, dateOfBirth, number);
		this.propertyList = propertyList;
		this.ownerList = ownerList;
	}

	/**
	 * Add property to host's property list
	 * @param property - the property to be added
	 */
	public void hostNewProperty(Property property) {
		this.propertyList.add(property);
	}

	/**
	 * remove property from host's property list
	 */
	public void removeProperty(Property property) {
		this.propertyList.remove(property);
	}

	/**
	 * Rent the property to a tenant
	 * @return
	 */
	public void rentProperty(Property property, Tenant tenant, Date startDate, Date endDate, String period, double rentFee) {
		// create rental agreement
		RentalAgreement rentalAgreement = new RentalAgreement();

		// set detail and participation
		rentalAgreement.setDetails(period, startDate, endDate, rentFee);
		rentalAgreement.setParticipation(tenant, null);
	}

	/**
	 * Add owner to host's owner list
	 * @param owner - the owner to be added
	 */
	public void addOwner(Person owner) {
		this.ownerList.add(owner);
	}

	// getter and setter
	public ArrayList<Property> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(ArrayList<Property> propertyList) {
		this.propertyList = propertyList;
	}

	public ArrayList<Person> getOwnerList() {
		return ownerList;
	}

	public void setOwnerList(ArrayList<Person> ownerList) {
		this.ownerList = ownerList;
	}
}
