package in.co.rays.statment;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Create_state1 {
	public static void main(String[] args) throws Exception  {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

	Statement stmt = conn.createStatement();

	int i = stmt.executeUpdate("select*,(physics + chemistry + maths) as total from marksheet"); 

	// executeupdate ka use data ko update , delete ,insert krne ke liye krte he
	
	System.out.println("Data Inserted = " + i); 

	
	
	}

	
	
	}


