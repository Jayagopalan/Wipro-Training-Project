package com.collection.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Doctor> doctors = new HashSet<Doctor>();

        System.out.print("Enter number of doctors to register: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Doctor " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();
            System.out.print("License Number: ");
            String license = sc.nextLine();

            Doctor newDoctor = new Doctor(name, department, license);

            if (doctors.add(newDoctor)) {
                System.out.println("Doctor registered successfully!");
            } else {
                System.out.println("Doctor with this license number already exists! Skipping registration.");
            }
        }

   
        System.out.println("\n....Registered Doctors....");
        for (Doctor d : doctors) {
            System.out.println(d);
        }

        sc.close();
    }
}
