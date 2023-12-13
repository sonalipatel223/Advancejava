package in.co.rays.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.bean.Userbeans;

import in.co.rays.util.JDBCDataSource;

public class Usermodals {
	public void add(Userbeans bean) throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getF_name());
		ps.setString(3, bean.getL_name());
		ps.setString(4, bean.getLogin_id());
	    ps.setString(5, bean.getPassword());
        ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
	    ps.setString(7, bean.getAddress());
	    
	    int i = ps.executeUpdate();
	    System.out.println("data inserted="+i);
	    
	}
	
	
		public void update(Userbeans bean)throws Exception{
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("update user set f_name=?,l_name=?,login_id=?,password=?,DOb=?,address=? where id = ?");
			
			ps.setInt(1, bean.getId());
			ps.setString(2,bean.getF_name());
			ps.setString(3, bean.getL_name());
			ps.setString(4, bean.getLogin_id());
			ps.setString(5, bean.getPassword());
			ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ps.setString(7, bean.getAddress());
			
		}


public Userbeans findByPk(int id ) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	//	
	 PreparedStatement ps = conn.prepareStatement("select * from user where id = ?");
	 
	 ps.setInt(1, id);
	 ResultSet rs = ps.executeQuery();
	 Userbeans bean = null;
	 
	 while(rs.next()) {
		 ps.setInt(1, bean.getId());
			ps.setString(2,bean.getF_name());
			ps.setString(3, bean.getL_name());
			ps.setString(4, bean.getLogin_id());
			ps.setString(5, bean.getPassword());
			ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ps.setString(7, bean.getAddress());
		
	 }
	 return bean;
	
	
}


public Integer nextPk() throws Exception {
	int  pk = 0;
	Connection conn = JDBCDataSource.getConnection();

	
	//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
   PreparedStatement ps = conn.prepareStatement("select max(id) from user");
     ResultSet rs = ps.executeQuery();
     while(rs.next()) {
 
    pk = rs.getInt(1);
 
}
        return pk +1;
}


        
public void add1(Userbeans bean)throws Exception {
	Connection conn = JDBCDataSource.getConnection();
	int pk = nextPk();
	     //Class.forName("com.mysql.cj.jdbc.Driver");
	      //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
             PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
              
              
              
            ps.setInt(1,pk); 
            ps.setString(2,bean.getF_name());
			ps.setString(3, bean.getL_name());
			ps.setString(4, bean.getLogin_id());
			ps.setString(5, bean.getPassword());
			ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ps.setString(7, bean.getAddress());
		
             
  			
  			int i = ps.executeUpdate();
  			
  			System.out.println("data inserted=" +i);
  			}


public Userbeans athenticate(String login_id,String password) throws Exception {
	Connection conn=JDBCDataSource.getConnection();
	PreparedStatement ps=conn.prepareStatement(" select * from user where login_id=? and password=? ");
	ps.setString(1, login_id);
	ps.setString(2, password);
	ResultSet rs=ps.executeQuery();
	Userbeans bean=null;
	while(rs.next()) {
		bean=new Userbeans();
		bean.setId(rs.getInt(1));
		bean.setF_name(rs.getString(2));
		bean.setL_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
		
	}
	return bean;
}


}






             





