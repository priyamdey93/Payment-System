package com.payment.system.entities;

public class NormalCreditCard extends CreditCard {

	public NormalCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super(name, cardNumber, cvv, dateOfExpiry, 0);

	}

}
