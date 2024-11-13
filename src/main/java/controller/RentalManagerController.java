package controller;

import model.Payments;
import model.Persons;
import model.Properties;
import model.RentalAgreements;
import utils.InputUtils;
import view.RentalManagerView;

import java.util.HashMap;

public class RentalManagerController implements RentalManager {
	// some models
	private Persons persons;
	private Properties properties;
	private RentalAgreements rentalAgreements;
	private Payments payments;

	// some views
	// private RentalManagerView rentalManagerView;

	// constructor
	public RentalManagerController() {
		// initialize models
		persons = new Persons();
		properties = new Properties();
		rentalAgreements = new RentalAgreements();
		payments = new Payments();
	}

	public void start() {

		// get user input here
		while (true) {
			// some logic here
			// show the welcome view
			RentalManagerView.welcomeView();

			// get user input
			String input = InputUtils.getStringInput();

			// navigate to the correct method
			switch (input) {
				case "1":
					// create a new rental contract
					create();
					break;
				case "2":
					// update a rental contract
					update();
					break;
				case "3":
					// delete a rental contract
					delete();
					break;
				case "4":
					// view a rental contract
					getOne();
					break;
				case "5":
					// view all rental contracts
					getAll();
					break;
				case "6":
					// exit the program
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
		}

	}

	// MARK: implement methods
	@Override
	public void create() {
		// display the form
		// HashMap<String, String> result = RentalManagerView.createRentalContractView(persons.getTenantsList());
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

	// public RentalManagerView getRentalManagerView() {
	// 	return rentalManagerView;
	// }
	//
	// public void setRentalManagerView(RentalManagerView rentalManagerView) {
	// 	this.rentalManagerView = rentalManagerView;
	// }
}
