package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.Userbeans;
import in.co.rays.modal.Usermodals;
@WebServlet("/AthenticateServlet2")
public class AthenticateServlet2  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String pass = req.getParameter("pass");

		Usermodals modal = new Usermodals();
		Userbeans bean;
		try {
			bean =  modal.athenticate(login, pass);

				System.out.print("\t" + bean.getLogin_id());
				System.out.print("\t" + bean.getPassword());

			if (bean != null) {
				RequestDispatcher rd = req.getRequestDispatcher("Wel_Come2.jsp");
				rd.forward(req, resp);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	
	resp.sendRedirect("Authenticate.jsp");
	}
}


