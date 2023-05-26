package AJP;

import java.sql.*;

public class Expt8 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	static String USER = "root"; //
	static String PASS = "root1234"; //

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String sql = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
