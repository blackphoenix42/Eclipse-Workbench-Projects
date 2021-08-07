package com.calculate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("no1"));
		int n2 = Integer.parseInt(request.getParameter("no2"));
		String s = request.getParameter("operation");
		switch (s) {
		case "sum":
			out.println(n1 + n2);
			break;
		case "sub":
			out.println(n1 - n2);
			break;
		case "mul":
			out.println(n1 * n2);
			break;
		case "div":
			out.println((float)n1 / n2);
			break;
		}
	}

}
