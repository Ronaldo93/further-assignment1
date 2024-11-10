package model;

import java.util.ArrayList;

public class Property {
  private String propertyId;

	// property detail
	private String address;
	// private double pricing;
	private PropertyStatus status;

	// property management
	private Person owner;
	private ArrayList<Host> host;

	public Property() {}
	public Property(String propertyId, String address, PropertyStatus status, Person owner) {
		this.propertyId = propertyId;
		this.address = address;
		// this.pricing = pricing;
		this.status = status;
		this.owner = owner;
		this.host = new ArrayList<Host>();
	}

}
