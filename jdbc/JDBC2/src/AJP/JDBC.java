package AJP;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC {
static final String DB_URL = "jdbc:mysql://localhost:3306/Cricket";
static final String USER = "root";
static final String PASS = "root1234";
static final String QUERY = "SELECT jersyNo, name, lastname, age FROM Registration";
public static void main(String[] args) {
// Open a connection
try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
Statement stmt = conn.createStatement();




ResultSet rs = stmt.executeQuery(QUERY);
) {
while(rs.next()){
//Display values
System.out.print("ID: " + rs.getInt("jersyNo"));
System.out.print(", Age: " + rs.getInt("age"));
System.out.print(", First: " + rs.getString("name"));
System.out.println(", Last: " + rs.getString("lastname"));
}
} catch (SQLException e) {
e.printStackTrace();
}
}
}