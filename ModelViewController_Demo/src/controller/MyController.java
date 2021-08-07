package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

@WebServlet("/MyController")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		if (id == null || id == "") {
			RequestDispatcher rd = request.getRequestDispatcher("Error");
			rd.forward(request, response);
		} else {
			Student obj = new Student();
			obj.setId(id);
			obj.setPass(pass);
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			request.setAttribute("data", obj);
			rd.forward(request, response);
			 
		}
	}

}
