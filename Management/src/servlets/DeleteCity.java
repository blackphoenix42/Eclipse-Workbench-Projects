package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cities.CityDAOImplementation;

@WebServlet("/DeleteCity")

public class DeleteCity extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		boolean result = new CityDAOImplementation().remove(id);
		
		PrintWriter out = resp.getWriter();
		
		if(result) {
			out.println("<h1>City Deleted Successfully</h1>");
		}
		else {
			out.println("<h1>City Deleted Failure</h1>");
		}
		
	}
	
	

}
