package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.Userbeans;
import in.co.rays.modal.Usermodals;
@WebServlet("/LoginCtl")

public class LoginCtl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.sendRedirect("Athenticate.jsp");
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		
		
		Userbeans bean = new Userbeans();
		bean.setLogin_id(loginId);
		bean.setPassword(password);
		Usermodals modal = new Usermodals();
		try {
			
			bean = modal.athenticate(loginId,password);
			
	
		if (bean!=null) {
		req.setAttribute("user", bean);
		RequestDispatcher rd = req.getRequestDispatcher("Welcome1.jsp");
		rd.forward(req, resp);
		
		}else {
				req.setAttribute("msg","userId and password not found!!!!!!" );
				RequestDispatcher rd = req.getRequestDispatcher("Athenticate.jsp");
				rd.forward(req, resp);
				
				
			}
	
	} catch (Exception e) {
		
		e.printStackTrace();
		
			
			
		}
	}
}
	
	

