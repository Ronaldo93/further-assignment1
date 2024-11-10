package model;

import java.util.ArrayList;

public class Property {
  private String propertyId;

	// property detail
	private String address;
	private double pricing;
	private PropertyStatus status;

	// property management
	private Person owner;
	private ArrayList<Host> host;
}
