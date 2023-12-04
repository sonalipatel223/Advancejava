package in.co.rays.practice;

public class Testmarksheet1 {
	public static void main(String[] args) throws Exception {
		//testadd();
		
		
	}
private static void testadd() throws Exception {
		
		Marksheetbean1 bean = new Marksheetbean1();
	bean.setId(15);
	bean.setRoll_no(112);
	bean.setName("nandu");
	bean.setPhysics(23);
	bean.setChemistry(67);
	bean.setMaths(89);
	
	Marksheetmodal1 modal = new Marksheetmodal1();
	modal.add(bean);
	
	
	
}
}
