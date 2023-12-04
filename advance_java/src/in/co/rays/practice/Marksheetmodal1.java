package in.co.rays.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import jdk.internal.util.Preconditions;




public class Marksheetmodal1 {
	public void  add(Marksheetbean1 bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll_no());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
		int i = ps.executeUpdate();
		
	System.out.println("data inserted="+i);
	
	
	}








public List search(Marksheetbean1 bean , int page_no,int pagesaize) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc://mysql://localhost:3006/rays", "root", "root");
	StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");
	
	if (bean!=null) {
		if (bean.getName()!=null&&bean.getName().length()>0) {
			}
	}
	System.out.println("sql query====>>>>"+sql);
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	ResultSet rs = ps.executeQuery();
	List list = new ArrayList();
	while(rs.next()) {
		
		bean = new Marksheetbean1();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	return null;
	
}











}
