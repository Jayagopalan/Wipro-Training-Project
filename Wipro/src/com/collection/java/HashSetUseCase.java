package com.collection.java;

import java.util.*;

class PatientReport {
	int id;
	String name;

	public PatientReport(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Patient[ID=" + id + ", Name=" + name + "]";
	}
}

public class HashSetUseCase {
	public static void main(String[] args) {
		HashSet<Integer> registeredIds = new HashSet<>();
		HashMap<Integer, PatientReport> patientMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n Hospital Patient Registration");
			System.out.println("1. Register Patient");
			System.out.println("2. View All Registered Patients");
			System.out.println("3. Remove Patient by ID");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				if (registeredIds.contains(id)) {
					System.out.println("Duplicate ID! Patient already registered.");
				} else {
					PatientReport newPatient = new PatientReport(id, name);
					registeredIds.add(id);
					patientMap.put(id, newPatient);
					System.out.println("Patient registered successfully!");
				}
				break;

			case 2:
				if (patientMap.isEmpty()) {
					System.out.println("No patients registered yet.");
				} else {
					System.out.println("\nRegistered Patients:");
					for (PatientReport p : patientMap.values()) {
						System.out.println(p);
					}
				}
				break;
			case 3:
				System.out.print("Enter Patient ID to remove: ");
				int removeId = sc.nextInt();
				if (registeredIds.contains(removeId)) {
					registeredIds.remove(removeId);
					patientMap.remove(removeId);
					System.out.println("Patient with ID " + removeId + " removed successfully.");
				} else {
					System.out.println("No patient found with ID " + removeId);
				}
				break;
			}
		} while (choice != 4);

		sc.close();
	}
}
