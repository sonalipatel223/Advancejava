package in.co.rays.transiction_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statment {
	public static void main(String[] args) throws Exception {
		Connection conn=null;
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonali", "root", "root");
			Statement stm = conn.createStatement();
				int i = stm.executeUpdate("insert into emp values(16,'deep',6700)");
				
				i = stm.executeUpdate("insert into emp values(16,'rupa',6700)");
				i = stm.executeUpdate("insert into emp values(17,'rupa',6700)");
				
				
				System.out.println("data inserted=" +i);
				

}
}
