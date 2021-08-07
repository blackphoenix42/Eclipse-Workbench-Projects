package routes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import miscellaneous.Miscellaneous;

public class RouteDAOImplementation implements RouteDAO{

	@Override
	public boolean checkroute(int startcity, int endcity) {
		 String query = "SELECT * FROM ROUTES WHERE STARTCITY = ? AND ENDCITY = ?";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
				 PreparedStatement pstmt = conn.prepareStatement(query);) {
			  
			  System.out.println("DB connection Established"); 
			  
			  pstmt.setInt(1,startcity);
			  pstmt.setInt(2,endcity);
			  
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
	public boolean insert(int startcity, int endcity) {
		
		 		
		if(checkroute(startcity, endcity)) {
			 System.out.println("Route Already Exist");
			 return false;
		 }
		
		 String query = "INSERT INTO ROUTES(STARTCITY,ENDCITY) VALUES(?,?)";
		 Connection conn = Miscellaneous.getDatabaseConnection();
		 try(
				 PreparedStatement pstmt = conn.prepareStatement(query);) {
			  System.out.println("DB connection Established"); 
			  
			  pstmt.setInt(1,startcity);
			  pstmt.setInt(2,endcity);
			  
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
