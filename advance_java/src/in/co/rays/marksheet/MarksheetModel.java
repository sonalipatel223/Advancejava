package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	
		public void add(Marksheetbean Bean) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
			
         PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
         
			
			
         ps.setInt(1, Bean.getId());
         ps.setString (2, Bean.getName());
         ps.setInt(3, Bean.getRoll_no());
         ps.setInt(4, Bean.getPhysics());
         ps.setInt(5, Bean.getChemistry());
         ps.setInt(6, Bean.getMaths());
        
          int i = ps.executeUpdate();
          
          System.out.println("data inserted="+i);
         
	}
		public void update(Marksheetbean Bean) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			
			PreparedStatement ps = conn.prepareStatement("update marksheet set name = ?,roll_no = ?,physics = ?,chemistry = ?,maths =? where id = ?");
			
			ps.setString(1,Bean.getName());
			ps.setInt(6,Bean.getId());
			ps.setInt(3,Bean.getPhysics());
			ps.setInt(4,Bean.getChemistry());
			ps.setInt(5,Bean.getMaths());
			ps.setInt(2,Bean.getRoll_no());
			
			int i = ps.executeUpdate();
			
			System.out.println("Data inserted = "+i);
		}
		
		public void delete(int id) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
			
			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println("data inserted = " +i);
		}
		
		
		
		public List search() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			PreparedStatement ps = conn.prepareStatement("select * from marksheet ");
					
			ResultSet rs = ps.executeQuery();
			List list = new ArrayList();
			while(rs.next()) {
			Marksheetbean bean = new Marksheetbean();
	  	      
           bean.setId(rs.getInt(1));
           bean.setName(rs.getString(2));
           bean.setRoll_no(rs.getInt(3));
           bean.setPhysics(rs.getInt(4));
           bean.setChemistry(rs.getInt(5));
           bean.setMaths(rs.getInt(6));
           
           list.add(bean);
           
		}
           
			return list;
			
}



public Marksheetbean findByPk(int id ) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
 PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");
 
 ps.setInt(1, id);
 ResultSet rs = ps.executeQuery();
 Marksheetbean bean = null;
 
 while(rs.next()) {
	 bean = new Marksheetbean();
	 bean.setId(rs.getInt(1));  
     bean.setName(rs.getString(2));
     bean.setRoll_no(rs.getInt(3));
     bean.setPhysics(rs.getInt(4));
     bean.setChemistry(rs.getInt(5));
     bean.setMaths(rs.getInt(6));
 }
 return bean;
	 
	 
 }

public Integer nextPk() throws Exception {
	int  pk = 0;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
   PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
     ResultSet rs = ps.executeQuery();
     while(rs.next()) {
 
    pk = rs.getInt(1);
 
}
        return pk +1;
}


        
public void add1(Marksheetbean bean)throws Exception {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
             PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
              int pk = nextPk();
              
              
            ps.setInt(1,pk);                //
              ps.setString(2,bean.getName());
              ps.setInt(3,bean.getRoll_no());
  			ps.setInt(4,bean.getPhysics());
  			ps.setInt(5,bean.getChemistry());
  			ps.setInt(6,bean.getMaths());
  			
  			int i = ps.executeUpdate();
  			
  			System.out.println("data inserted=" +i);
  			}
             










public List search2(Marksheetbean bean,int page_no,int pageSize) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	
	
	StringBuffer sql = new StringBuffer("select * from marksheet where 1=1");
	if (bean!= null) {
		if (bean.getName() != null && bean.getName().length()>0) {
			sql.append(" and name like '"+bean.getName()+"%'");
			
		}
		if (bean.getRoll_no()>0) {
			sql.append(" and roll_no = "+bean.getRoll_no()+" ");
			
			}
		}
	if (pageSize>0) {
		
		page_no = (page_no-1)*pageSize;
		
		sql.append(" limit "+ page_no+ ", "+pageSize);
		
	}
	System.out.println("sql query........>>"+sql);
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	ResultSet rs = ps.executeQuery();
	List list = new ArrayList();
	while(rs.next()) {
	 bean = new Marksheetbean();
	
   bean.setId(rs.getInt(1));
   bean.setName(rs.getString(2));
   bean.setRoll_no(rs.getInt(3));
   bean.setPhysics(rs.getInt(4));
   bean.setChemistry(rs.getInt(5));
   bean.setMaths(rs.getInt(6));
   
   list.add(bean);
   
}
   
	return list;
	
}
}


	














