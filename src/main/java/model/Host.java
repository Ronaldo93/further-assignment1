package model;

import utils.SerializeUtils;

import java.util.ArrayList;
import java.util.Date;

public class Host extends Person{
	private ArrayList<Integer> propertyList;
	private ArrayList<Integer> ownerList;

	public Host() {
		super();
		this.propertyList = new ArrayList<Integer>();
		this.ownerList = new ArrayList<Integer>();
	}

	public Host(int id, java.lang.String name, Date dateOfBirth, java.lang.String number, ArrayList<Integer> stringList, ArrayList<Integer> ownerList) {
		super(id, name, dateOfBirth, number);
		this.propertyList = propertyList;
		this.ownerList = ownerList;
	}

	/**
	 * Add property to host's property list
	 * @param property - the property to be added
	 */
	public void hostNewProperty(Property property) {
		this.propertyList.add(property.getPropertyId());
		System.out.println("[Host.hostNewProperty] Property added to host's property list");
		System.out.println("[Host.hostNewProperty] current property size: " + this.propertyList.size());
	}

	/**
	 * remove property from host's property list
	 */
	public void removeProperty(Property string) {
		this.propertyList.remove(string);
	}

	/**
	 * Rent the property to a tenant
	 * @return
	 */
	public void rentProperty(Property string, Tenant tenant, ArrayList<Integer> subTenant, Date startDate, Date endDate, java.lang.String period, double rentFee) {
		// create rental agreement
		RentalAgreement rentalAgreement = new RentalAgreement();

		// set detail and participation
		rentalAgreement.setDetails(period, startDate, endDate, rentFee);
		rentalAgreement.setParticipation(tenant.getId(), subTenant);
	}

	/**
	 * Add owner to host's owner list
	 * @param owner - the owner to be added
	 */
	public void addOwner(Person owner) {
		this.ownerList.add(owner.getId());
	}

	/**
	 * Serialize this object to a json string
	 * @return json string
	 */
	public java.lang.String serialize() {
		// use gson to serialize this object
		java.lang.String jsonStr = SerializeUtils.serialize(this);
		return jsonStr;
	}

	public void deserialize(java.lang.String jsonStr) {
		// use gson to deserialize this object
		Host host = (Host) SerializeUtils.deserialize(jsonStr, Host.class);
		this.setId(host.getId());
		this.setName(host.getName());
		this.setDateOfBirth(host.getDateOfBirth());
		this.setNumber(host.getNumber());
		this.setPropertyList(host.getPropertyList());
		this.setOwnerList(host.getOwnerList());
	}



	// getter and setter
	public ArrayList<Integer> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(ArrayList<Integer> propertyList) {
		this.propertyList = propertyList;
	}

	public ArrayList<Integer> getOwnerList() {
		return ownerList;
	}

	public void setOwnerList(ArrayList<Integer> ownerList) {
		this.ownerList = ownerList;
	}
}
