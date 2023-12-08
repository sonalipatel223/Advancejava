package in.co.rays.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class Metadata {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery("select id,name,salary from emp");
	ResultSetMetaData md =  rs.getMetaData();
	
	System.out.println("Catlod Name:"+md.getCatalogName(1));
	
	System.out.println("Table Name:"+ md.getTableName(1));
	
	int columnCount = md.getColumnCount();
	
	System.out.println("Table column:"+columnCount);
	for (int i = 1; i <= columnCount; i++) {
		
		System.out.println("columnCount:"+i);
		
		System.out.println("lable:"+md.getColumnLabel(i));
		System.out.println("lable:"+md.getCatalogName(i));
		System.out.println("lable:"+md.getColumnType(i));
		System.out.println("lable:"+md.getColumnDisplaySize(i));
		System.out.println("lable:"+md.getPrecision(i));

		
		
	}
		
		
	}

}
