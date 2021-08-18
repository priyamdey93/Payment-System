package com.payment.system;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.payment.system.entities.CreditCard;
import com.payment.system.entities.GoldCreditCard;
import com.payment.system.entities.NormalCreditCard;
import com.payment.system.entities.SilverCreditCard;

class CreditCardPaymentTest {


	private CreditCardPayment creditCardPayment;

	@Test
	void testPayWhenSilverCreditCard() {
		CreditCard cs = new SilverCreditCard("John", "76869-8642548-8793", "xxx", "09-05-2023");
		creditCardPayment = new CreditCardPayment(cs);
		Assertions.assertEquals(6300, creditCardPayment.pay(7000));
		
	}
	
	@Test
	void testPayWhenGoldCreditCard() {
		CreditCard cs = new GoldCreditCard("John", "76869-8642548-8793", "xxx", "09-05-2023");
		creditCardPayment = new CreditCardPayment(cs);
		Assertions.assertEquals(5600, creditCardPayment.pay(7000));
		
	}
	
	@Test
	void testPayWhenNormalCreditCard() {
		CreditCard cs = new NormalCreditCard("John", "76869-8642548-8793", "xxx", "09-05-2023");
		creditCardPayment = new CreditCardPayment(cs);
		Assertions.assertEquals(7000, creditCardPayment.pay(7000));
		
	}

}
