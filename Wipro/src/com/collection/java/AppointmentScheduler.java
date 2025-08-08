package com.collection.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Appointment {
	private int patientId;
	private String patientName;
	private String doctorName;
	private String time;

	public Appointment(int patientId, String patientName, String doctorName, String time) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [patientId=" + patientId + ", patientName=" + patientName + ", doctorName=" + doctorName
				+ ", time=" + time + "]";
	}

}

public class AppointmentScheduler {
	public static void main(String[] args) {
		TreeMap<Integer, Appointment> Appointments = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("....APPOINTMENT SCHEDULER....");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointments");
			System.out.println("3. Remove Appointment");
			System.out.println("4. Reschedule Appointment");
			System.out.println("5. Check Next and Last Appointment");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Appointment ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Doctor Name: ");
				String doctor = sc.nextLine();

				System.out.print("Enter Appointment Time (HH:MM): ");
				String time = sc.nextLine();
				Appointments.put(id, new Appointment(id, name, doctor, time));
				System.out.println("Patient Added Successfully\n");
				break;

			case 2:
				if (Appointments.isEmpty()) {
					System.out.println("No appointments scheduled \n");
				} else {
					System.out.println("\n... All Scheduled Appointments (Sorted) ...");
					for (Map.Entry<Integer, Appointment> entry : Appointments.entrySet()) {
						System.out.println(entry.getValue());
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.print("Enter Appointment ID to remove: ");
				int ids = sc.nextInt();
				if (Appointments.remove(ids) != null) {
					System.out.println("Appointment removed successfully!\n");
				} else {
					System.out.println("No appointment found with ID: " + ids + "\n");
				}
				break;
			case 4:
				System.out.print("Enter Old Appointment ID: ");
				int oldId = sc.nextInt();
				sc.nextLine();

				if (!Appointments.containsKey(oldId)) {
					System.out.println("No appointment found with ID: " + oldId + "\n");
					break;
				}

				System.out.print("Enter New Appointment ID: ");
				int newId = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter New Time (HH:MM): ");
				String newTime = sc.nextLine();

				Appointment appt = Appointments.remove(oldId);
				Appointments.put(newId, appt);
				System.out.println("Appointment rescheduled successfully!\n");
				break;
			case 5:
				if (Appointments.isEmpty()) {
					System.out.println("No appointments scheduled.\n");
				} else {
					System.out.println("\nNext Appointment: " + Appointments.firstEntry().getValue());
					System.out.println("Last Appointment: " + Appointments.lastEntry().getValue() + "\n");
				}
			case 6:
				System.out.println("Exiting... Thank you!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Try again.\n");
			}
		}

	}
}