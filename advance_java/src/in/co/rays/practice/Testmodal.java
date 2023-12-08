package in.co.rays.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import in.co.rays.util.JDBCDataSource;

public class Testmodal {
	public  void add(Testbean bean) throws Exception{
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getF_name());
		ps.setString(3, bean.getL_name());
		ps.setString(4, bean.getLogin_id());
		ps.setString(5,bean.getPassword());
		ps.setDate(6,new java.sql.Date(bean.getDOB().getTime()));
		ps.setString(7, bean.getAddress());
		
		int i = ps.executeUpdate();
		System.out.println("data inserted ="+i);
		
	}

	
	
	
}
