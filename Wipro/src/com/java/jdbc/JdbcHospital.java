package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcHospital {
	public static void main(String[] args) {
		  String url = "jdbc:mysql://localhost:3306/Hospital";
	      String user = "root";
	      String password = "2580";

	        String insertSQL = "INSERT INTO patients(name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
	        try (Scanner sc = new Scanner(System.in)) {
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");

	           
	            try (Connection conn = DriverManager.getConnection(url, user, password);
	                 PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

	                String choice;
	                do {
	                    
	                    System.out.print("\nEnter Patient Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Disease: ");
	                    String disease = sc.nextLine();

	                    System.out.print("Enter Admission Date (YYYY-MM-DD): ");
	                    String admissionDate = sc.nextLine();

	                    System.out.print("Enter Doctor Assigned: ");
	                    String doctor = sc.nextLine();

	                    pstmt.setString(1, name);
	                    pstmt.setInt(2, age);
	                    pstmt.setString(3, disease);
	                    pstmt.setString(4, admissionDate);
	                    pstmt.setString(5, doctor);

	                   
	                    int rows = pstmt.executeUpdate();
	                    System.out.println("Patient added successfully!");

	                    
	                    System.out.print("\nDo you want to add another patient? (yes/no): ");
	                    choice = sc.nextLine();

	                } while (choice.equalsIgnoreCase("yes"));
	                sc.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
