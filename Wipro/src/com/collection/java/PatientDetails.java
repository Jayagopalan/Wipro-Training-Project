package com.collection.java;

import java.io.*;
import java.util.Scanner;

public class PatientDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = "patients.pdf";
        boolean patients = true;

        try {
            while (patients) {
                System.out.println("Enter patient ID:");
                int id = in.nextInt();
                in.nextLine(); 

                System.out.println("Enter patient name:");
                String name = in.nextLine();

                System.out.println("Enter patient age:");
                int age = in.nextInt();
                
                
                System.out.println("Enter patient disease:");
                String disease = in.nextLine();
                in.nextLine(); 
               
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.write("Patient ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: " + age);
                writer.newLine();
                writer.close();

                
                System.out.println("Do you want to add another patient [yes/no]");
                String answer = in.nextLine().toLowerCase();
                if (!answer.equals("yes") && !answer.equals("y")) {
                    patients = false;
                }
            }

            System.out.println("Patient data saved successfully!");

           
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nAll patient records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        in.close();
    }
}

