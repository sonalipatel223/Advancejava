package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestSourceBundle {
	public static void main(String[] args) {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app");
		System.out.println(rs.getString("Greeting"));
	}

}
