package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cities.City;
import cities.CityDAO;
import cities.CityDAOImplementation;

@WebServlet("/CityOperation")
public class CityOperation extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		PrintWriter out = resp.getWriter();
		switch(action) {
		case "insert" :
			String cityname = req.getParameter("cityname");
			System.out.printf("City Name: %s\n",cityname);
			
			CityDAO citydao = new CityDAOImplementation();
			citydao.insert(cityname);
			
			out.println("<h1>City Inserted!</h1>");
			
			break;
		case "delete" :
			int id = Integer.parseInt(req.getParameter("id"));
			boolean result = new CityDAOImplementation().remove(id);
			
			if(result) {
				out.println("<h1>City Deleted Successfully</h1>");
			}else {
				out.println("<h1>City Deleted Failure</h1>");
			}
			
			break;
		case "update" :
			id = Integer.parseInt(req.getParameter("id"));
			cityname = req.getParameter("cityname");
			
			City city = new City();
			city.setId(id);
			city.setName(cityname);
			
			result = new CityDAOImplementation().update(city);
			
			if(result) {
				out.println("<h1>City Updated Successfully</h1>");
			}else {
				out.println("<h1>City Update Failure</h1>");
			}

			break;
		
		}
	}
	

}
