package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/Hospital";
		String user = "root";
		String password = "2580";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);

			Statement stmt = conn.createStatement();
//			String sql = "CREATE TABLE Hospital(" + "id INT PRIMARY KEY AUTO_INCREMENT, " + ""
//					+ "name VARCHAR(50) NOT NULL, "
//					+ "age INT NOT NULL, "
//					+ "disease VARCHAR(25)" + ")";
			String sql= "INSERT INTO Hospital(name, age, disease) VALUES(?, ?, ?)";
			PreparedStatement st = conn.prepareStatement(sql);
			//stmt.executeUpdate(sql);
			st.setString(1, "Jai");
			st.setInt(2, 22);
			st.setString(3, "Fever");
			int rows = st.executeUpdate();
			if(rows>0)
			System.out.println("Values Inserted Successfully");
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
