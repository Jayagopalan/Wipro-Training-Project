package com.usecases.java;

import java.util.Scanner;

class InvalidPinException extends Exception {
	public InvalidPinException(String message) {
		super(message);
	}
}

public class ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int correctPin = 2580;

		try {
			System.out.print("Enter your PIN: ");
			int pin = scanner.nextInt();

			if (pin != correctPin) {
				throw new InvalidPinException("Invalid PIN!");
			}

			System.out.println("Access granted. Welcome!");

		} catch (InvalidPinException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Transaction logged.");
		}

		scanner.close();
	}
}
