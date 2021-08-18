package com.payment.system;

import com.payment.system.entities.GoldCreditCard;
import com.payment.system.entities.Item;
import com.payment.system.entities.NormalCreditCard;
import com.payment.system.entities.SilverCreditCard;

public class PaymentSystemApplication {

	private static final String NAME = "John";
	private static final String CARD_NUMBER = "095098-86769-86784-84657";
	private static final String CVV = "xxx";
	private static final String EXPIRY_DATE = "06-05-2024";

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		Item tShirt = new Item("#004", 1000);
		Item nikeShoe = new Item("#009", 4000);

		cart.addItem(tShirt);
		cart.addItem(nikeShoe);

		// amount to be paid by a Gold Credit Card Holder
		double amountToBePaidByGoldCard = cart
				.pay(new CreditCardPayment(new GoldCreditCard(NAME, CARD_NUMBER, CVV, EXPIRY_DATE)));
		System.out.println("Payable by Gold Credit Card Holder : " +amountToBePaidByGoldCard); //4000

		
		// amount to be paid by a Silver Credit Card Holder
		double amountToBePaidBySilverCard = cart
				.pay(new CreditCardPayment(new SilverCreditCard(NAME, CARD_NUMBER, CVV, EXPIRY_DATE)));
		System.out.println("Payable by Silver Credit Card Holder : " +amountToBePaidBySilverCard); //4500
		
		
		// amount to be paid by a Normal Credit Card Holder
		double amountToBePaidByNormalCard = cart
				.pay(new CreditCardPayment(new NormalCreditCard(NAME, CARD_NUMBER, CVV, EXPIRY_DATE)));
		System.out.println("Payable by Normal Credit Card Holder : " +amountToBePaidByNormalCard); //5000
	}

}
