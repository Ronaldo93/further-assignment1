package controller;

import model.Payments;
import model.Persons;
import model.Properties;
import model.RentalAgreements;

public class RentalManagerController implements RentalManager {
	// some models
	private Persons persons;
	private Properties properties;
	private RentalAgreements rentalAgreements;
	private Payments payments;

	// some views

	// constructor
	public RentalManagerController() {
		// initialize models
		persons = new Persons();
		properties = new Properties();
		rentalAgreements = new RentalAgreements();
		payments = new Payments();
	}

	// MARK: implement methods
	@Override
	public void create() {
		// some logic here
	}

	@Override
	public void delete() {
		// some logic here
	}

	@Override
	public void update() {
		// some logic here
	}

	@Override
	public void getOne() {
		// some logic here
	}

	@Override
	public void getAll() {
		// some logic here
	}

	// getter and setter
	public Persons getPersons() {
		return persons;
	}

	public void setPersons(Persons persons) {
		this.persons = persons;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public RentalAgreements getRentalAgreements() {
		return rentalAgreements;
	}

	public void setRentalAgreements(RentalAgreements rentalAgreements) {
		this.rentalAgreements = rentalAgreements;
	}

	public Payments getPayments() {
		return payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

  
}
