package in.co.rays.practice;


import java.text.SimpleDateFormat;

public class Test_MB {
	public static void main(String[] args) throws Exception{
		Testadd();
		
		
	}

	private static void Testadd() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Testbean bean = new Testbean();
		bean.setId(3);
		bean.setF_name("rahul");
		bean.setLogin_id("kirar");
		bean.setLogin_id("rahul@1234gmail.com");
		bean.setPassword("3456");
		bean.setDOB(sdf.parse("2022-12-12"));
		bean.setAddress("bhopal");
		Testmodal modal = new Testmodal();
		modal.add(bean);
		
		
		
		
	}

}
