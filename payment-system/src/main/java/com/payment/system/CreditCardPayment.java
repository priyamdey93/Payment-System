package com.payment.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.payment.system.entities.CreditCard;

public class CreditCardPayment implements Payment {

	@Autowired
	private CreditCard creditCard;

	public CreditCardPayment(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public double pay(double amount) {
		return amount - ((creditCard.getDiscount() / 100) * amount);
	}

}
