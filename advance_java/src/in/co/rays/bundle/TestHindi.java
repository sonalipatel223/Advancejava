package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestHindi {
public static void main(String[] args) {
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
	System.out.println(rs.getString("Greeting"));
}
	
}

