package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServelet")

public class FirstServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String f_name = req.getParameter("firstName");
	String l_name = req.getParameter("lastName");
	
	System.out.println("First servelet doget");
	System.out.println("f_name");
	System.out.println("l_name");
	
	//resp.sendRedirect("SecondSevelet");   
	

	 
	RequestDispatcher rd = req.getRequestDispatcher("Secondsevelet");
	rd.forward(req, resp);
	

		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String f_name = req.getParameter("firstName");
		String l_name = req.getParameter("lastName"); 
       System.out.println("First servelet dopost");
		
		System.out.println(f_name);
		System.out.println(l_name);
		
		//resp.sendRedirect("Secondsevelet");           
		 // for forword method
		
		RequestDispatcher rd = req.getRequestDispatcher("Secondsevelet");
		rd.forward(req, resp);
		
		
		
		
	}

}
