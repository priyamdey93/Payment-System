package com.payment.system.entities;

public class SilverCreditCard extends CreditCard  {

	public SilverCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super(name, cardNumber, cvv, dateOfExpiry, 10);
	}
	
	

}
