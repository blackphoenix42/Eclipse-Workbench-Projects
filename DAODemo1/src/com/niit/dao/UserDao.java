package com.niit.dao;
import com.niit.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.niit.bean.User;

public class UserDao 
{
 static Connection con;
 public static int save(User u)
 {
	int status=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("insert into users(name,password,email,sex,country) values(?,?,?,?,?)");
		ps.setString(1,u.getName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getSex());
		ps.setString(5,u.getCountry());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int update(User u)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("update users set name=?,password=?,email=?,sex=?,country=? where id=?");
		ps.setString(1,u.getName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getSex());
		ps.setString(5,u.getCountry());
		ps.setInt(6,u.getId());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(User u)
{
	int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from users where id=?");
		ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
public static List<User> getAllRecords()
{
	List<User> list=new ArrayList<User>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from users");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setSex(rs.getString("sex"));
			u.setCountry(rs.getString("country"));
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}

public static User getRecordById(int id)
{
	User u=null;
	System.out.println("in getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from users where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setSex(rs.getString("sex"));
			u.setCountry(rs.getString("country"));
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return u;
	}
}
