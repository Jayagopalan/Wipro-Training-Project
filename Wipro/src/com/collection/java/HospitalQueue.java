package com.collection.java;

import java.util.LinkedList;
import java.util.Scanner;

public class HospitalQueue {

	    static class Patient {
	        String name;

	        Patient(String name) {
	            this.name = name;
	        }

	        public String toString() {
	            return name;
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList<Patient> queue = new LinkedList<>();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("1. Add patient - normal");
	            System.out.println("2. Add patient - emergency");
	            System.out.println("3. Remove patient");
	            System.out.println("4. View all patients");
	            System.out.println("5. Check first patient");
	            System.out.println("6. Check last patient");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            if (choice == 1) {
	                System.out.print("Enter patient name: ");
	                String name = sc.nextLine();
	                queue.addLast(new Patient(name));
	                System.out.println("Patient added to the end of the queue.");

	            } else if (choice == 2) {
	                System.out.print("Enter emergency patient name: ");
	                String emergencyName = sc.nextLine();
	                queue.addFirst(new Patient(emergencyName));
	                System.out.println("Emergency patient added to the front of the queue.");

	            } else if (choice == 3) {
	                if (!queue.isEmpty()) {
	                    Patient removed = queue.removeFirst();
	                    System.out.println("Removed patient: " + removed);
	                } else {
	                    System.out.println("Queue is empty.");
	                }

	            } else if (choice == 4) {
	                if (queue.isEmpty()) {
	                    System.out.println("No patients in the queue.");
	                } else {
	                    System.out.println("Current patients in queue:");
	                    for (Patient p : queue) {
	                        System.out.println("- " + p);
	                    }
	                }

	            } else if (choice == 5) {
	                if (!queue.isEmpty()) {
	                    System.out.println("First patient: " + queue.getFirst());
	                } else {
	                    System.out.println("Queue is empty.");
	                }

	            } else if (choice == 6) {
	                if (!queue.isEmpty()) {
	                    System.out.println("Last patient: " + queue.getLast());
	                } else {
	                    System.out.println("Queue is empty.");
	                }

	            } else if (choice ==7 ) {
	                System.out.println("Exiting...");

	            } else {
	                System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 0);

	      
	    }

}
