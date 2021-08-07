package examples;

import java.sql.*;

class Example1 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonooo", "root", "anshu123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}