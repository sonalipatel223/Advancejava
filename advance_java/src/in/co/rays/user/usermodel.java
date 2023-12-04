package in.co.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.co.rays.marksheet.Marksheetbean;

public class usermodel {
	public void add(Userbean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		
	   PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
	   
	   ps.setInt(1, bean.getId());
		ps.setString(2, bean.getF_name());
		ps.setString(3, bean.getL_name());
		ps.setString(4, bean.getLogin_id());
		ps.setString(5, bean.getPassword());
		ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(7, bean.getAddress());
		
		int i = ps.executeUpdate();
		System.out.println("data inseted =" +i);
		}

	
		public List search12() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			PreparedStatement ps = conn.prepareStatement("select * from user");
					
			ResultSet rs = ps.executeQuery();
			List list = new ArrayList();
			while(rs.next()) {
			 Userbean bean=new Userbean();
			 bean.setId(rs.getInt(1));
			 bean.setF_name(rs.getString(2));
			 bean.setL_name(rs.getString(3));
			 bean.setLogin_id(rs.getString(4));
			 bean.setPassword(rs.getString(5));
			 bean.setDob(rs.getDate(6));
			
			 
			list.add(bean);
			
	}
			return list;
	
	
		}
}


