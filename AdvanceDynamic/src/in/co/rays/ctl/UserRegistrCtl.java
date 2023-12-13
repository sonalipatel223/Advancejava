package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.Userbeans;
import in.co.rays.modal.Usermodals;
import in.co.rays.util.DataUtility;

@WebServlet("/UserRegistrCtl")
public class UserRegistrCtl extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		String f_name = req.getParameter("firstName");
		String l_name = req.getParameter("lastName");
		String login = req.getParameter("loginId");
		String pass = req.getParameter("password");
		String Dob = req.getParameter("dob");
		String address = req.getParameter("address");

		Userbeans bean = new Userbeans();
		 
		bean.setF_name(f_name);
		bean.setL_name(l_name);
		bean.setLogin_id(login);
		bean.setPassword(pass);
		bean.setDob(DataUtility.stringToDate(Dob));
		bean.setAddress(address);

		Usermodals modal = new Usermodals();
		try {
			modal.add(bean);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		resp.sendRedirect("UserRegistr.jsp");

	}

}
