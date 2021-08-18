package com.payment.system.entities;

public class CreditCard {

	private String name;
	private String cardNumber;
	private String cvvNumber;
	private String dateOfExpiry;
	private double discountPercentage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvvNumber;
	}

	public void setCvv(String cvv) {
		this.cvvNumber = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public double getDiscount() {
		return discountPercentage;
	}

	public void setDiscount(double discount) {
		this.discountPercentage = discount;
	}

	public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry, double discount) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvvNumber = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.discountPercentage = discount;
	}

}