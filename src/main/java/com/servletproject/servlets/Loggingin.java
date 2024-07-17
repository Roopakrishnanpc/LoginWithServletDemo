package com.servletproject.servlets;
import com.servletproject.dao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//http://localhost:8081/LoginServletDemoProject/login.jsp
/**
 * Servlet implementation class Loggingin
 */
@WebServlet("/Loggingin")
public class Loggingin extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		daoCheck(req,resp);
	}
	public void daoCheck(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String uname=req.getParameter("uname");
		String pass=req.getParameter("password");
		LoginDao dao=new LoginDao();
		if(dao.check(uname,pass))
		{
			HttpSession session=req.getSession();
			session.setAttribute("unamelabel", uname);
			resp.sendRedirect("Welcom.jsp");
		}
		else
		{
			resp.sendRedirect("login.jsp");
		}	
	
	}
	public void simpleOneCheckValidation(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String uname=req.getParameter("uname");
		String pass=req.getParameter("password");
		if(uname.equals("roopakrishnan") && pass.equals("Roopa!98"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("unamelabel", uname);
			resp.sendRedirect("Welcom.jsp");
		}
		else
		{
			resp.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
