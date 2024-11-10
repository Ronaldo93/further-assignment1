package model;

import java.util.ArrayList;

public class Tenant extends Person {
	private ArrayList<RentalAgreement> rentalAgreementList;
	private Payment transaction;
	private ArrayList<Property> propertyList;
}
