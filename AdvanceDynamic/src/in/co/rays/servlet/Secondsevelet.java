package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Secondsevelet")

public class Secondsevelet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String f_name = req.getParameter("firstName");
		String l_name = req.getParameter("lastName");
		System.out.println("second servelet doget");
		
		System.out.println(f_name);
		System.out.println(l_name);
		
		
		} 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String f_name = req.getParameter("firstName");
		String l_name = req.getParameter("lastName");
		System.out.println("second servelet doget");
		
		System.out.println(f_name);
		System.out.println(l_name);
		
	}

}
