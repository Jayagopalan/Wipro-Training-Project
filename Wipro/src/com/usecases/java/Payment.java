package com.usecases.java;

abstract class Payment {
	public abstract void makePayment(double amount);

	public void printReceipt(double amount) {
		System.out.println("Payment of " + amount + " completed successfully.");
	}

}

class CreditCard extends Payment {
	public void makePayment(double amount) {
		System.out.println("Processing credit card payment of " + amount + "...");
		printReceipt(amount);
	}
}

class UPI extends Payment {
	public void makePayment(double amount) {
		System.out.println("Processing UPI payment of " + amount + "...");
		printReceipt(amount);
	}
}

class NetBanking extends Payment {
	public void makePayment(double amount) {
		System.out.println("Processing Net Banking payment of " + amount + "...");
		printReceipt(amount);
	}
}
