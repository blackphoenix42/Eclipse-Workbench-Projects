package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("uname");
		out.print("<h1>Welcome "+n+"</h1>");
		
		HttpSession session=request.getSession();
		session.setAttribute("uname",n);
		String id=session.getId();
		out.print("<h3>Session Id="+id+"</h3>");
		
		out.print("<a href='servlet2'>visit</a>");
				
		out.close();

         }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
