package in.co.rays.marksheet.copy;

import java.util.Iterator;
import java.util.List;




public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		 //testadd();
		//testdelet();
		//testupdate();
		//testsearch();
		//testFindByPk();
		 // testadd1();
		//testsearch2();
		 for (int i = 0; i < 50; i++) {
			 System.out.println("total = " + i);
			// testFindByPk();
			 //testadd();
			testsearch2();
			 
			 
		}
	}

	private static void testadd1() throws Exception{
		Marksheetbean bean = new Marksheetbean();
		
		 
		bean.setName("mahiii");
		bean.setRoll_no(109);
		bean.setPhysics(36);
		bean.setChemistry(58);
        bean.setMaths(22);	
        
        MarksheetModel model = new MarksheetModel();
        
        model.add1(bean);
		
	
	
	
	
	}

	private static void testFindByPk() throws Exception {             // PK--->> primary key 
		MarksheetModel model = new MarksheetModel();
		Marksheetbean bean = model.findByPk(7);               // id se table search hogi...
		
		if (bean!=null) {
			
			System.out.println(bean.getId());
			System.out.println( bean.getName());
			System.out.println(bean.getRoll_no());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
            System.out.println(bean.getMaths());			
		}else {
			System.out.println("id dose not exist !!!!!!");
				
	  		}
			
		}
			
		
		
		private static void testsearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		List list = model.search();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			Marksheetbean bean =  (Marksheetbean) it.next();
			
			System.out.print("\t" +bean.getId()); 
			System.out.print("\t" +bean.getName());
			System.out.print("\t" +bean.getRoll_no());
			System.out.print("\t" +bean.getPhysics());
			System.out.print("\t" +bean.getChemistry());
			System.out.println("\t" +bean.getMaths());
		}
		}
	
	
	
	
	
	
	private static void testupdate() throws Exception {
		Marksheetbean Bean = new Marksheetbean ();
		Bean.setId(13);
		Bean.setName("madhu");
		Bean.setPhysics(67);
		Bean.setChemistry(78);
		Bean.setMaths(14);
		Bean.setRoll_no(109);
		
		MarksheetModel model = new MarksheetModel();
		model.update(Bean);
	}

	private static void testdelet() throws Exception{
		
		MarksheetModel  model = new MarksheetModel();
		model.delete(0);
		
    }

	private static void testadd() throws Exception {
		Marksheetbean bean = new Marksheetbean();
		
	    bean.setId(18);
		bean.setName("rays");
		bean.setRoll_no(123);
		bean.setPhysics(45);
		bean.setChemistry(78);
		bean.setMaths(88);
		
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
		
	}
	


private static void testsearch2()throws Exception {
	
	Marksheetbean bean = new Marksheetbean ();
	//bean.setName("m");
	bean.setRoll_no(106);
	
	MarksheetModel model = new MarksheetModel();
	//List list = model.search2(bean);
	
	List list = model.search2(bean, 1, 2);
	Iterator it = list.iterator(); 
	
	while(it.hasNext()) {
		
		bean =  (Marksheetbean) it.next();
		
		System.out.print("\t" +bean.getId()); 
		System.out.print("\t" +bean.getName());
		System.out.print("\t" +bean.getRoll_no());
		System.out.print("\t" +bean.getPhysics());
		System.out.print("\t" +bean.getChemistry());
		System.out.println("\t" +bean.getMaths());
	}
	
	
	}
}























