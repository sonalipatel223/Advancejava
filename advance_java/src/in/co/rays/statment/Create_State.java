package in.co.rays.statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_State {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		
		Statement stm = conn.createStatement();
		
  //int i = stm.executeUpdate("update marksheet set name='minal' where id = 6");
		//int i = stm.executeUpdate("delete from marksheet where id = 3");
		//int i = stm.executeUpdate("insert into marksheet values(97,'prg',115,34,76,89)");
		//int i=stm.executeUpdate("alter table marksheet drop total2");
	//int i = stm.executeUpdate("insert into marksheet values(18,'abc',116,56,67,14)");
		
	int i = stm.executeUpdate("insert into marksheet values(48,'manshu jain',195,57,77,84)");
	
		System.out.println("Data Inserted=" +i);
		
	}

}
