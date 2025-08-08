package com.usecases.java;

public class PaymentMain {
	 public static void main(String[] args) {
	        Payment payment;

	        payment = new CreditCard();
	        payment.makePayment(1000.00);

	        payment = new UPI();
	        payment.makePayment(500.50);

	        payment = new NetBanking();
	        payment.makePayment(750.25);
	    }

}
