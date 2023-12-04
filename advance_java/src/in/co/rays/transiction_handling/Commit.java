package in.co.rays.transiction_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Commit {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonali", "root", "root");
				conn.setAutoCommit(false);
				Statement stm = conn.createStatement();
				int i = stm.executeUpdate("insert into emp values(18,'deep',6700)");
				
				i = stm.executeUpdate("insert into emp values(18,'rupa',6700)");
				i = stm.executeUpdate("insert into emp values(19,'rupa',6700)");
				conn.commit();
				
				System.out.println("data inserted=" +i);
				

			conn.commit();
			System.out.println("done");
		}
	
	}


