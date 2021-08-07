package miscellaneous;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Miscellaneous implements ServletContextListener{
	
	private static Connection databaseConnection = fetchDBConnection();
	
	private static Connection fetchDBConnection() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Found");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null; 
		}
		
		try {
			String url ="jdbc:mysql://remotemysql.com:3306/MDCiFVpng7";
			String user ="MDCiFVpng7";
			String pass ="tsIsZqpsCD";
			
			return DriverManager.getConnection(url, user, pass);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Connection getDatabaseConnection() {
		return databaseConnection;
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			databaseConnection.close();
			System.out.println("DB Connection Closed!");
		}catch(Exception e) {
			
		}
		System.out.println("Project Stopped");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Project Started");
	}
	

}
