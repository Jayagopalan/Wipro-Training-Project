package com.usecases.java;

import java.util.Scanner;

public class BookDetails {
	static String[] titles = new String[10];
	static String[] authors = new String[10];
	static int[] prices = new int[10];
	static int count = 0;

	public static void addBook(String title, String author, int price) {
		if (count < titles.length) {
			titles[count] = title;
			authors[count] = author;
			prices[count] = price;
			count++;
			System.out.println("Book added successfully.\n");
		} else {
			System.out.println("Book storage is full.\n");
		}
	}

	public static void displayBooks() {
		if (count == 0) {
			System.out.println("No books to display.\n");
		} else {
			System.out.println(" Book List ");
			for (int i = 0; i < count; i++) {
				System.out.println("Book " + (i + 1));
				System.out.println("Title : " + titles[i]);
				System.out.println("Author: " + authors[i]);
				System.out.println("Price : " + prices[i]);
				System.out.println();
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
	
			System.out.println("1. Add Book");
			System.out.println("2. Display Books");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter title: ");
				String title = sc.nextLine();
				System.out.print("Enter author: ");
				String author = sc.nextLine();
				System.out.print("Enter price: ");
				int price = sc.nextInt();
				addBook(title, author, price);
				break;

			case 2:
				displayBooks();
				break;

			case 3:
				System.out.println("Exiting. Thank you!");
				break;

			default:
				System.out.println("Invalid choice.\n");
			}

		} while (choice != 3);

		sc.close();
	}
}
