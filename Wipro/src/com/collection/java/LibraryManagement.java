package com.collection.java;

import java.util.*;

class Book {
	int id;
	String title;
	String author;
	boolean isAvailable;

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: "
				+ (isAvailable ? "Yes" : "No");
	}
}

public class LibraryManagement {
	private HashMap<Integer, Book> library = new HashMap<>();
	private Scanner sc = new Scanner(System.in);

	
	public void addBook() {
		System.out.print("Enter Book ID: ");
		int id = sc.nextInt();
		sc.nextLine(); 
		if (library.containsKey(id)) {
			System.out.println("Book with this ID already exists!");
			return;
		}
		System.out.print("Enter Book Title: ");
		String title = sc.nextLine();
		System.out.print("Enter Author Name: ");
		String author = sc.nextLine();

		library.put(id, new Book(id, title, author));
		System.out.println("Book added successfully!");
	}

	
	public void removeBook() {
		System.out.print("Enter Book ID to remove: ");
		int id = sc.nextInt();
		if (library.remove(id) != null) {
			System.out.println("Book removed successfully!");
		} else {
			System.out.println("Book ID not found!");
		}
	}

	
	public void searchBook() {
		System.out.print("Enter Book ID to search: ");
		int id = sc.nextInt();
		Book book = library.get(id);
		if (book != null) {
			System.out.println("Book Found: " + book);
		} else {
			System.out.println("Book not found!");
		}
	}

	
	public void borrowBook() {
		System.out.print("Enter Book ID to borrow: ");
		int id = sc.nextInt();
		Book book = library.get(id);
		if (book != null) {
			if (book.isAvailable) {
				book.isAvailable = false;
				System.out.println("You borrowed: " + book.title);
			} else {
				System.out.println("Book is already borrowed!");
			}
		} else {
			System.out.println("Book ID not found!");
		}
	}

	
	public void returnBook() {
		System.out.print("Enter Book ID to return: ");
		int id = sc.nextInt();
		Book book = library.get(id);
		if (book != null) {
			if (!book.isAvailable) {
				book.isAvailable = true;
				System.out.println("Book returned successfully!");
			} else {
				System.out.println("This book was not borrowed!");
			}
		} else {
			System.out.println("Book ID not found!");
		}
	}

	
	public void displayBooks() {
		if (library.isEmpty()) {
			System.out.println("No books in library.");
		} else {
			System.out.println("Library Books:");
			for (Book book : library.values()) {
				System.out.println(book);
			}
		}
	}
	public void menu() {
		while (true) {
			System.out.println("\n LIBRARY MENU ");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book by ID");
			System.out.println("4. Borrow Book");
			System.out.println("5. Return Book");
			System.out.println("6. Display All Books");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				borrowBook();
				break;
			case 5:
				returnBook();
				break;
			case 6:
				displayBooks();
				break;
			case 7:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	public static void main(String[] args) {
		LibraryManagement library = new LibraryManagement();
		library.menu();
	}
}
