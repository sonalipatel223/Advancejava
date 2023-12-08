package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class testuser {
	public static void main(String[] args)throws Exception {
		//testadd();
		//testsearch();
		testsearch2();
		
		
	}

	private static void testsearch2() throws Exception {
		Userbean bean = new Userbean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setDob(sdf.parse("2001-10-22"));
		Usermodel model = new Usermodel();
		List list = model.search2(bean);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			bean = (Userbean) it.next();
			
			System.out.println(bean.getId());
			System.out.println(bean.getF_name());
			System.out.println(bean.getL_name());
			System.out.println(bean.getLogin_id());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());
			
			
			
		}
		}
		
		private static void testsearch() throws Exception {
		//Userbean bean = new Userbean();
		
		Usermodel model = new Usermodel();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Userbean bean=(Userbean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getF_name());
			System.out.print("\t" +bean.getL_name());
			System.out.print("\t" +bean.getLogin_id());
			System.out.print("\t" +bean.getPassword());
			System.out.print("\t" +bean.getDob());
			System.out.println("\t" +bean.getAddress());
		}	
	}




	private static void testadd() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Userbean bean = new Userbean();
		
		bean.setId(2);
		bean.setF_name("prachii");
		bean.setL_name("mukati");
		bean.setLogin_id("prachii@gmail.com");
		bean.setPassword("12345");
		bean.setDob(sdf.parse("2004-5-1"));
		bean.setAddress("khargone");
		
		Usermodel model = new Usermodel();
		model.add(bean);
		
		
		
	}

}
