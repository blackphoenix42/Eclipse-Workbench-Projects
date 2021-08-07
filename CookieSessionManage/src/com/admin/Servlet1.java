package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n=request.getParameter("userName");
			
			out.print("<h3>Welcome "+n+"</h3>");
			
			Cookie ck=new Cookie("uname",n);
	       	response.addCookie(ck);
	       	
			out.print("<form action='servlet2' method='post'>");
			out.print("<input type='submit' value='submit'>");
			out.print("</form>");
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
