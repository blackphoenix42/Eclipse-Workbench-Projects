package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("uname");
		out.print("<h1>Hello "+n+" -First Servlet</h1>");
		out.print("<form action='SecondServlet'>");
		out.print("<input type='hidden' name='username' value='"+n+"'/>");
		out.print("<input type='submit' value='Click!!!'/>");
		out.print("</form>");
	}

}
