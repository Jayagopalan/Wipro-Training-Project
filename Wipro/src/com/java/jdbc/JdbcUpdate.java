package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hospital";
		String user = "root";
		String password = "2580";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);
			String sql= "UPDATE hospital SET name=? WHERE name =?";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, "Jayagopalan");
			st.setString(2, "Jai");
			int n = st.executeUpdate();
			 if (n > 0) {
	                System.out.println("Record updated successfully!");
	            } else {
	                System.out.println("Record Updation Failed");
	            }
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
