package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;



public class ProcedureInOut {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonali", "root", "root");

  CallableStatement callstmt = conn.prepareCall("{CALL empInOut(?)}");
  callstmt.setInt(1, 1);
		callstmt.registerOutParameter(1,Types.INTEGER);
		callstmt.execute();
		System.out.println(callstmt.getInt(1));
	}

}
