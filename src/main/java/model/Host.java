package model;

import java.util.ArrayList;

public class Host extends Person{
	//  list of properties managed by this host. A host should keep track of a list of the cooperating owners and rental agreements.
	private ArrayList<Property> propertyList;
	private ArrayList<Person> ownerList;
}
