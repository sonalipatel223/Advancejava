package in.co.rays.statment;                 // prepaid statment

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");            

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

	Statement stmt = conn.createStatement();

	int i = stmt.executeUpdate("update marksheet set name = 'dilip ' where id = 4");

	System.out.println("Data Inserted = " + i); 

	  
	}
}
