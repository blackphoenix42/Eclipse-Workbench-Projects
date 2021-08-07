<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="cities.City"%>
<%@page import="cities.CityDAO"%>
<%@page import="cities.CityDAOImplementation"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<c:import url = "header.jsp"/> 
<%
 	CityDAO cityDao = new CityDAOImplementation();
 %>
</head>
<body>

	<div class = "container">
	<h1> Route Management</h1>	
	<hr>
	</div>
	
	<form action = "/Sample/RouteOperation" method = "post" class="container">
	
	<div class="form-group">
		<label for="startcityname">Start City Name:</label>
		<select class='form-control' name="startcityname">
			<%
			for(City city : cityDao.fetchAllCitites()){
			%>
				<option value="<%=city.getId()%>"><%= city.getName()%> </option>
			<%} %>
		</select>
		<div class="form-group">
		<label for="endcityname">End City Name:</label>
		<select class='form-control' name="endcityname">
			<%
			for(City city : cityDao.fetchAllCitites()){
			%>
				<option value="<%=city.getId()%>"><%= city.getName()%> </option>
			<%} %>
		</select>
		
	</div>
	<input type = "hidden" name = "action" value="insert" >
	</div>
	<button type="Submit" class ="btn btn-primary"><i class = "fas fa-plus"></i> Add</button>
	</form>
	

</body>
</html>