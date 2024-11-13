package model;

import java.util.Date;

public class Payment {
	//  amount, date, and the payment method.
	// user who made the payment and the user who received the payment
	private int id;
	private int buyerId;
	private int sellerId;

	// set payment detail
	private double amount;
	private Date date;
	private PaymentMethod paymentMethod;

	// Constructor
	public Payment() {}
	public Payment(int id, int buyerId, int sellerId, double amount, Date date, PaymentMethod paymentMethod) {
		this.id = id;
		this.buyerId = buyerId;
		this.sellerId = sellerId;
		this.amount = amount;
		this.date = date;
		this.paymentMethod = paymentMethod;
	}

	/**
	 * Set the buyer and seller of the payment
	 * @param buyerId Buyer of the payment
	 * @param sellerId Seller of the payment
	 */
	public void createPaymentUser(int buyerId, int sellerId) {
		setBuyerId(buyerId);
		setSellerId(sellerId);
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
	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
