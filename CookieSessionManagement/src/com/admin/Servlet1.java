package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String n = request.getParameter("uname");
		out.print("<h1>Hello "+n+" -First Servlet</h1>");
		
		Cookie ck = new Cookie("username", n);
		response.addCookie(ck);
		
		out.print("<form action='servlet2' method='post'");
		out.print("<input type='submit' value='Click'/>");
		out.print("</form>");
	}

}
