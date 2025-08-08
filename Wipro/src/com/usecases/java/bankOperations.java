package com.usecases.java;

import java.util.Scanner;

public class bankOperations {

	static double balance = 1000.0;

	public static void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Enter a valid amount.");
		}
	}

	public static void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("Enter a valid amount.");
		}
	}

	public static void showBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: ");
				double dep = sc.nextDouble();
				deposit(dep);
				break;

			case 2:
				System.out.print("Enter withdrawal amount: ");
				double wd = sc.nextDouble();
				withdraw(wd);
				break;

			case 3:
				showBalance();
				break;

			case 4:
				System.out.println("Thank you! Visit again.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 4);
	}
}
