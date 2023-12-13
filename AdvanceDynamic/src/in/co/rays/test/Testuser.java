package in.co.rays.test;



import java.text.SimpleDateFormat;

import in.co.rays.bean.Userbeans;

import in.co.rays.modal.Usermodals;

public class Testuser {
	public static void main(String[] args) throws Exception {
		//testadd();
		//testusers();
		testadd1();
		
		
	}

	private static void testusers() throws Exception {
		
		
		
	}

	private static void testadd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Userbeans bean = new Userbeans();
		
		bean.setId(6);
		bean.setF_name("rupali");
		bean.setL_name("patel");
		bean.setLogin_id("rupalip1234@gmail.com");
		bean.setPassword("2003");
		bean.setDob(sdf.parse("2003-05-23"));
		
		Usermodals modal = new Usermodals();
		modal.add(bean);
		
		
	}
	private static void testadd1() throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Userbeans bean = new Userbeans();
		bean.setF_name("pali");
		bean.setL_name("patel");
		bean.setLogin_id("palip1234@gmail.com");
		bean.setPassword("2003");
		bean.setDob(sdf.parse("2003-05-23"));
		
		 
		
        
        Usermodals model = new Usermodals();
        
        model.add1(bean);
		
	
	
	
	
	}	
		}


