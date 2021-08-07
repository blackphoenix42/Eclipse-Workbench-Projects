package cities;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import miscellaneous.Miscellaneous;

public class CityDAOImplementation implements CityDAO {
	
	@Override
	public boolean update(City city) {
		String query = "UPDATE CITIES SET NAME = ? WHERE ID = ?";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
				 PreparedStatement pstmt = conn.prepareStatement(query);
			){
			 
			 pstmt.setString(1,city.getName());
			 pstmt.setInt(2,city.getId());
			 pstmt.executeUpdate();
			 
			 System.out.println("Updated Successfully!");
			 return true;
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		return false;
	}

	@Override
	public City fetchCity(int id) {
		 City city = new City();
		 String query = "SELECT * FROM CITIES WHERE ID=?";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
				 PreparedStatement pstmt = conn.prepareStatement(query);
			){
			 
			 pstmt.setInt(1,id);
			 ResultSet rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 city.setId(rs.getInt("Id"));
				 city.setName(rs.getString("Name"));
				 return city;
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return city;
	}

	@Override
	public boolean remove(int id) {
		 String query = "DELETE FROM CITIES WHERE ID=?";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(PreparedStatement pstmt = conn.prepareStatement(query);){
			 
			 pstmt.setInt(1,id);
			 pstmt.executeUpdate();
			 System.out.println("City Removed!");
			 return true;
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		return false;
	}

	@Override
	public List<City> fetchAllCitites() {
		List<City> cities = new ArrayList<City>();
//		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 System.out.println("Driver Found");
//			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			return cities; 
//		}
//		 String url ="jdbc:mysql://remotemysql.com:3306/MDCiFVpng7";
//		 String user ="MDCiFVpng7";
//		 String pass ="tsIsZqpsCD";
		 String query = "SELECT * FROM CITIES ";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
//				 Connection conn = DriverManager.getConnection(url, user, pass);
				 PreparedStatement pstmt = conn.prepareStatement(query);
				 ){
			  System.out.println("DB connection Established"); 
			  			  
			  ResultSet rs = pstmt.executeQuery();
			  while(rs.next()) {
				  City city = new City();
				  city.setId(rs.getInt("ID"));
				  city.setName(rs.getString("NAME"));
				  cities.add(city);
			  }
			 
		 }catch(Exception e){
			  e.printStackTrace();			  
		 }
		 if(cities.size()!=0) {
			 Collections.sort(cities, (c1,c2)->c1.getId()-c2.getId());
		 }
		return cities;
	}

	@Override
	public boolean checkCity(String city) {
//		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 System.out.println("Driver Found");
//			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			return false;
//		}
//		 String url ="jdbc:mysql://remotemysql.com:3306/MDCiFVpng7";
//		 String user ="MDCiFVpng7";
//		 String pass ="tsIsZqpsCD";
		 String query = "SELECT * FROM CITIES WHERE NAME = ?";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
//				 Connection conn = DriverManager.getConnection(url, user, pass);
				 PreparedStatement pstmt = conn.prepareStatement(query);) {
			  
			  System.out.println("DB connection Established"); 
			  
			  pstmt.setString(1,city);
			  
			  ResultSet rs = pstmt.executeQuery();
			  while(rs.next()) {
				  return true;
			  }
			 
		 }catch(Exception e){
			  e.printStackTrace();
			  return false;
		 }
		 System.out.println("QUERY EXECUTED SUCCESSFULLY");
		 return false;
	}

	@Override
	public boolean insert(String city) {
		if (city == null) {
			System.out.println("Can't be NULL");
			return false;
		}
		
		if(city.equals("")) {
			System.out.println("Can't be empty");
			return false;
		}
		if(this.checkCity(city)) {
			System.out.println("City Already Exist");
			return false;
		}
//		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 System.out.println("Driver Found");
//			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			return false;
//		}
//		 String url ="jdbc:mysql://remotemysql.com:3306/MDCiFVpng7";
//		 String user ="MDCiFVpng7";
//		 String pass ="tsIsZqpsCD";
		 String query = "INSERT INTO CITIES (NAME) VALUES(?)";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
//				 Connection conn = DriverManager.getConnection(url, user, pass);
				 PreparedStatement pstmt = conn.prepareStatement(query);) {
			  System.out.println("DB connection Established"); 
			  
			  
			  pstmt.setString(1,city);
			  int result = pstmt.executeUpdate();
			  System.out.println("ADDED: "+result+" ROWS AFFECTED");
			 
		 }catch(Exception e){
			  e.printStackTrace();
			  return false;
		 }
		 System.out.println("QUERY EXECUTED SUCCESSFULLY");
		return true;
	}
	

}
