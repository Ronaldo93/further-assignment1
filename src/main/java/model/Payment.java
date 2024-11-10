package model;

import java.util.Date;

public class Payment {
	//  amount, date, and the payment method.


	// user who made the payment and the user who received the payment
	private Tenant buyer;
	private Host seller;

	// set payment detail
	private double amount;
	private Date date;
	private PaymentMethod paymentMethod;

	// Constructor
	public Payment() {}
	public Payment(Tenant buyer, Host seller, double amount, Date date, PaymentMethod paymentMethod) {
		this.buyer = buyer;
		this.seller = seller;
		this.amount = amount;
		this.date = date;
		this.paymentMethod = paymentMethod;
	}

	/**
	 * Set the buyer and seller of the payment
	 * @param buyer Buyer of the payment
	 * @param seller Seller of the payment
	 */
	public void createPaymentUser(Tenant buyer, Host seller) {
		setBuyer(buyer);
		setSeller(seller);
	}

	/**
	 * Set the payment detail
	 * @param amount The amount of the payment
	 * @param date The date of the payment
	 * @param paymentMethod The payment method used
	 */
	public void createPaymentDetail(double amount, Date date, PaymentMethod paymentMethod) {
		setAmount(amount);
		setDate(date);
		setPaymentMethod(paymentMethod);
	}


	// getter and setter
	public Tenant getBuyer() {
		return buyer;
	}

	public void setBuyer(Tenant buyer) {
		this.buyer = buyer;
	}

	public Host getSeller() {
		return seller;
	}

	public void setSeller(Host seller) {
		this.seller = seller;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
