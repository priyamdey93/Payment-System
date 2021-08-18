package com.payment.system.entities;

public class GoldCreditCard extends CreditCard {

	public GoldCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super(name, cardNumber, cvv, dateOfExpiry, 20);

	}

}
