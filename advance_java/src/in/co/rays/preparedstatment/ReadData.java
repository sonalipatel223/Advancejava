package in.co.rays.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class ReadData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		
		//PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=2"); 
		//PreparedStatement ps = conn.prepareStatement("update marksheet set name ='xyz' where id = 1"); 
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(24,'lokesh',121,67,78,90)"); 
		
		
		
		int i = ps.executeUpdate();
		
		

		System.out.println("Data update="+i);
		
		
		
		
	}

}
