package model;

import java.util.ArrayList;
import java.util.Date;

public class Tenant extends Person {
	private ArrayList<RentalAgreement> rentalAgreementList;
	private ArrayList<Payment> transaction;
	private ArrayList<Property> propertyList;

	public Tenant() {
		super();
		this.rentalAgreementList = new ArrayList<RentalAgreement>();
		this.transaction = new ArrayList<Payment>();
		this.propertyList = new ArrayList<Property>();
	}

	public Tenant(int id, String name, Date dateOfBirth, String number, ArrayList<RentalAgreement> rentalAgreementList, ArrayList<Payment> transaction, ArrayList<Property> propertyList) {
		super(id, name, dateOfBirth, number);
		this.rentalAgreementList = rentalAgreementList;
		this.transaction = transaction;
		this.propertyList = propertyList;
	}

	/**
	 * Allows tenant to make payment from their account
	 * @param host - the host to make payment to
	 * @param amount - the amount to be paid
	 * @return true if payment is successful, false otherwise
	 */
	public void makeAPayment(Host host, double amount, PaymentMethod paymentMethod) {
		Date date = new Date();

		Payment payment = new Payment();

		// create payment
		payment.createPaymentDetail(amount, date, paymentMethod);
		payment.createPaymentUser(this, host);

		// add payment to transaction
		this.transaction.add(payment);
		// todo: add payment to host's transaction - set id
		System.out.println("Payment successful...");
	}

	/**
	 * Add payment to tenant's transaction
	 * @param payment - the payment to be added
	 */
	public void addPayment(Payment payment) {
		this.transaction.add(payment);
	}

	/**
	 * add rented property to tenant's property list
	 * @param property - the property to be added
	 */
	public void rentAHouse(Property property) {
		this.propertyList.add(property);
	}

	/**
	 * add rental agreement to tenant's rental agreement list
	 * @param rentalAgreement - the rental agreement to be added
	 */
	public void addRentalAgreement(RentalAgreement rentalAgreement) {
		this.rentalAgreementList.add(rentalAgreement);
	}

	// getters and setters
	public ArrayList<RentalAgreement> getRentalAgreementList() {
		return rentalAgreementList;
	}

	public void setRentalAgreementList(ArrayList<RentalAgreement> rentalAgreementList) {
		this.rentalAgreementList = rentalAgreementList;
	}

	public ArrayList<Payment> getTransaction() {
		return transaction;
	}

	public void setTransaction(ArrayList<Payment> transaction) {
		this.transaction = transaction;
	}

	public ArrayList<Property> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(ArrayList<Property> propertyList) {
		this.propertyList = propertyList;
	}
}
