package AJP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Expt4 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/Cricket";
	static String USER = "root"; //
	static String PASS = "root1234"; //

	public static void main(String[] args) {
		
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			// Execute a query
			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO Registration VALUES (100, ' Sachin ', 'Tendulkar', 18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration VALUES (101, 'Virat', 'Kohli', 25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration VALUES (102, 'Mahedra singh', 'Dhoni', 30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration VALUES(103, 'Rohit', 'Sharma', 28)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

