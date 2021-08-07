package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import routes.RouteDAO;
import routes.RouteDAOImplementation;

@WebServlet("/RouteOperation")
public class RouteOperation extends HttpServlet {

	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String startcityname = req.getParameter("startcityname");
		String endcityname = req.getParameter("endcityname");
		
		int startcity = Integer.parseInt(req.getParameter("startcityname"));
		int endcity = Integer.parseInt(req.getParameter("endcityname"));
	
		System.out.printf("Start City Name : %s , End City Name : %s",startcityname,endcityname);
		
		PrintWriter out = resp.getWriter();
		if( startcityname.equalsIgnoreCase(endcityname)) {
			out.print("<h1>Start and End City Names cannot be the same</h1>");
		}
		String action = req.getParameter("action");
		switch(action) {
		case "insert" :
	
			RouteDAO routeDAO = new RouteDAOImplementation();
			boolean result = routeDAO.insert(startcity, endcity);
			
			if (result)
				out.println("<h1>Route Inserted Successfully!</h1>");
			else 
				out.println("<h1>Route Insertion Failure !</h1>");
	
			break;
		}

	}
}
