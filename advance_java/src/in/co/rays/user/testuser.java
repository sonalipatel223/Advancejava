package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class testuser {
	public static void main(String[] args)throws Exception {
		//testadd();
		testsearch();
		
		
	}

	private static void testsearch() throws Exception {
		//Userbean bean = new Userbean();
		
		usermodel model = new usermodel();

		List list = model.search12();

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
		
		usermodel model = new usermodel();
		model.add(bean);
		
		
	}

}
