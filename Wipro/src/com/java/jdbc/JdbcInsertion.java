package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcInsertion {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String user = "root";
		String password = "2580";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);
			String sql= "INSERT INTO Hospital(name, age, disease) VALUES(?, ?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);
			String [][] values = {
					{"Sharan","23", "Cold"},
					{"Vicky", "23", "Cough"},
					{"Ragav", "22", "Fever"}
			};
			for(String [] n : values) {
				st.setString(1, n[0]);
				st.setInt(2, Integer.parseInt(n[1]));
				st.setString(3, n[2]);
				st.executeUpdate();
			}
			System.out.println(" All patients inserted successfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
