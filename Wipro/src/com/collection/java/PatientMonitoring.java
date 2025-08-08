package com.collection.java;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
	String name;
	int age;
	String problem;

	public Patient(String name, int age, String problem) {
		this.name = name;
		this.age = age;
		this.problem = problem;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Problem: " + problem);
	}
}

public class PatientMonitoring {
	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add Patient");
			System.out.println("2. List All Patients");
			System.out.println("3. Search Patient by Name");
			System.out.println("4. List Patients by Minimum Age");
			System.out.println("5. Total no of Patients");
			System.out.println("6. Clear All Records");
			System.out.println("7. Remove Patient by Name");
			System.out.println("8. Exit");
			System.out.print("Enter your choice : ");

			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.print("Enter patient name: ");
				String name = sc.nextLine();
				System.out.print("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter problem: ");
				String problem = sc.nextLine();

				patients.add(new Patient(name, age, problem));
				System.out.println("Patient added.\n");

			} else if (choice == 2) {
				if (patients.isEmpty()) {
					System.out.println("No patients found.");
				} else {
					System.out.println("List of Patients:");
					for (Patient p : patients) {
						p.display();
					}
				}

			} else if (choice == 3) {
				System.out.print("Enter name to search: ");
				String searchName = sc.nextLine();
				boolean found = false;
				for (Patient p : patients) {
					if (p.name.equalsIgnoreCase(searchName)) {
						System.out.println("Patient found:");
						p.display();
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Patient not found.");
				}

			} else if (choice == 4) {
				System.out.print("Enter minimum age: ");
				int minAge = sc.nextInt();
				sc.nextLine();
				boolean any = false;
				for (Patient p : patients) {
					if (p.age >= minAge) {
						p.display();
						any = true;
					}
				}
				if (!any) {
					System.out.println("No patients found with age ≥ " + minAge);
				}

			} else if (choice == 5) {
				System.out.println("Total number of patients: " + patients.size());

			} else if (choice == 6) {
				System.out.print("Are you sure you want to clear all records? (yes/no): ");
				String confirmClear = sc.nextLine();
				if (confirmClear.equalsIgnoreCase("yes")) {
					patients.clear();
					System.out.println("All patient records cleared.");
				} else {
					System.out.println("Clear operation canceled.");
				}

			} else if (choice == 7) {
				System.out.print("Enter name to remove: ");
				String removeName = sc.nextLine();
				boolean removed = false;
				for (int i = 0; i < patients.size(); i++) {
					if (patients.get(i).name.equalsIgnoreCase(removeName)) {
						patients.remove(i);
						System.out.println("Patient removed successfully.");
						removed = true;
						break;
					}
				}
				if (!removed) {
					System.out.println("Patient not found.");
				}
			} else if (choice == 8) {
				System.out.println("Exiting...");
				break;

			} else {
				System.out.println("❗ Invalid choice. Please enter 1 to 4.");
			}
		}
	}
}
