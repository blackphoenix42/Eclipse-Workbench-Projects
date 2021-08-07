package com.niit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil 
{
	static Connection con=null;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("Driver Loaded Successfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","password@123");
			System.out.println("Connection Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}
