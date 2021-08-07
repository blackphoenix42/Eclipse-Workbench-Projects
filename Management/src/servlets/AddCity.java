package servlets;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cities.CityDAO;
import cities.CityDAOImplementation;

public class AddCity extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("City Added : Get");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("City Added : Post");
		
		String city = req.getParameter("cityname");
		System.out.printf("City Name : %s \n",city);
		
		CityDAO cityDao = new CityDAOImplementation();
		cityDao.insert(city);
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver Found");
//			
//			Connection dc = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/MDCiFVpng7", "MDCiFVpng7","tsIsZqpsCD" );
//			System.out.println("Connection Established");
//			
//			String query = "INSERT INTO CITIES (NAME) VALUES ('"+ city +"')";
//			System.out.println(query);
//			
//			Statement stmt = dc.createStatement();
//			stmt.executeUpdate(query);
//			stmt.close();
//			dc.close();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
		PrintWriter abc = resp.getWriter();
		abc.println("<h1>City Added!</h1>");
		
		
	}
	
	

}
