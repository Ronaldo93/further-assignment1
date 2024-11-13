package model;

import java.util.ArrayList;
import java.util.Date;

public class Tenant extends Person {
	private ArrayList<Integer> rentalAgreementList;
	private ArrayList<Integer> transaction;
	private ArrayList<Integer> stringList;

	public Tenant() {
		super();
		this.rentalAgreementList = new ArrayList<Integer>();
		this.transaction = new ArrayList<Integer>();
		this.stringList = new ArrayList<Integer>();
	}

	public Tenant(int id, java.lang.String name, Date dateOfBirth, java.lang.String number, ArrayList<Integer> rentalAgreementList, ArrayList<Integer> transaction, ArrayList<Integer> stringList) {
		super(id, name, dateOfBirth, number);
		this.rentalAgreementList = rentalAgreementList;
		this.transaction = transaction;
		this.stringList = stringList;
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
		payment.createPaymentUser(this.getId(), host.getId());

		// add payment to transaction
		this.transaction.add(payment.getId());
		// todo: add payment to host's transaction - set id
		System.out.println("Payment successful...");
	}

	/**
	 * Add payment to tenant's transaction
	 * @param payment - the payment to be added
	 */
	public void addPayment(Payment payment) {
		this.transaction.add(payment.getId());
	}

	/**
	 * add rented property to tenant's property list
	 * @param property - the property to be added
	 */
	public void rentAHouse(int property) {
		this.stringList.add(property);
	}

	/**
	 * add rental agreement to tenant's rental agreement list
	 * @param rentalAgreement - the rental agreement to be added
	 */
	public void addRentalAgreement(int rentalAgreement) {
		this.rentalAgreementList.add(rentalAgreement);
	}

	// getters and setters
	public ArrayList<Integer> getRentalAgreementList() {
		return rentalAgreementList;
	}

	public void setRentalAgreementList(ArrayList<Integer> rentalAgreementList) {
		this.rentalAgreementList = rentalAgreementList;
	}

	public ArrayList<Integer> getTransaction() {
		return transaction;
	}

	public void setTransaction(ArrayList<Integer> transaction) {
		this.transaction = transaction;
	}

	public ArrayList<Integer> getPropertyList() {
		return stringList;
	}

	public void setPropertyList(ArrayList<Integer> stringList) {
		this.stringList = stringList;
	}
}
