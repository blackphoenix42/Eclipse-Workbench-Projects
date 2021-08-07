package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
									
			Cookie ck[]=request.getCookies();
			out.print("<h3>Hello "+ck[0].getValue()+"<h3>");

			out.close();

         }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
