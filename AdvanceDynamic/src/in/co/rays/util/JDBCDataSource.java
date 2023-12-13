package in.co.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCDataSource {

	private static JDBCDataSource jds=null;

	private static ComboPooledDataSource cpds = null;
	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundles.system");

	private JDBCDataSource() {
	   
	
			try {

			cpds = new ComboPooledDataSource();

			cpds.setDriverClass(rb.getString("driver")); 

			cpds.setJdbcUrl(rb.getString("url"));
			

			cpds.setUser(rb.getString("userName"));

			cpds.setPassword(rb.getString("password"));

			cpds.setInitialPoolSize (Integer.parseInt(rb.getString("InitialPoolSize")));

			cpds.setAcquireIncrement (Integer.parseInt(rb.getString("AcquireIncrement")));

			cpds.setMaxPoolSize (Integer.parseInt(rb.getString("MaxPoolSize")));

			} catch (PropertyVetoException e) {

			e.printStackTrace();
			}
			}

	public static JDBCDataSource getInstance() {
		
			if (jds == null) {

			jds = new JDBCDataSource(); 
			
			}

			return jds;

			}

	public static Connection getConnection() {

		try {
			return getInstance().cpds.getConnection();

		} catch (SQLException e) {
			return null;
		}
	}

}
