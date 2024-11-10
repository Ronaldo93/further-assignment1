package model;

import java.util.ArrayList;

public class Property {
  private String propertyId;
	private String address;
	private double pricing;
	private PropertyStatus status;
	private Person owner;
	private ArrayList<Host> host;
}
