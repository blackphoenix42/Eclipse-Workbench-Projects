package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletConfig config = null; // Reference Creation
	ServletContext context = null;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		config = getServletConfig();
		context = config.getServletContext();
		String uname = config.getInitParameter("username");
		String dname = context.getInitParameter("drivername");
		PrintWriter out = response.getWriter();
		out.print("<h1>Config Object Data = "+uname+"</h1>");	
		out.print("<h1>Context Object Data = "+dname+"</h1>");	

	}

}
