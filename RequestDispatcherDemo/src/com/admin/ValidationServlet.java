package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ValidationServlet() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pass = request.getParameter("pname");
		if(name.equals("admin")&&pass.equals("admin@123")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WelcomeServlet");
			rd.forward(request, response);
//			use rd.include(request,response) to include the contents of the servlet
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/ErrorServlet");
			rd.forward(request, response);
		}
	}

}
