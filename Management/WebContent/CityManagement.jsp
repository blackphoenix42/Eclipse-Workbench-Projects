<%@page import="cities.City"%>
<%@page import="cities.CityDAO"%>
<%@page import="cities.CityDAOImplementation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
 <c:import url = "header.jsp"/> 
</head>
<body>

	<div class = "container">
	<h1> City Management</h1>	
	<hr>
	</div>
	
	<form action = "/Sample/CityOperation" method = "post" class="container">
	<div class="form-group">
		<label for="cityname">City Name:</label>
		<input name="cityname" type = "text" class ="form-control" placeholder="Enter City Name" id = "cityname">
	</div>
	<input type = "hidden" name = "action" value="insert" >
	<br>
	<button type="Submit" class ="btn btn-primary"><i class = "fas fa-plus"></i>Add</button>
	</form>
	
	
	<div class="container">
	<br>
	<h3>Current Cities:</h3>
	<table class ='table table-striped'>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>OPERATIONS</th>
			</tr>
		</thead>
		<tbody>
			
					<%
						CityDAO cityDao = new CityDAOImplementation();
						for( City city: cityDao.fetchAllCitites() ){
					%>
			<tr>
			<td> <%=city.getId() %> </td>
			<td> <%=city.getName() %> </td>
			<td> 
				<form method="post" action="/Management/CityOperation" style="display: inline;">
					<input type="hidden" name="id" value="<%=city.getId()%>">
					<input type = "hidden" name = "action" value="delete" >
					<button type="submit" class="btn btn-danger btn-sm "><i class = "fas fa-minus"></i>Delete</button>
				</form>
				<a href = "/Management/EditCity.jsp?id=<%=city.getId()%>" class="btn btn-success btn-sm " style="margin-left:50px;"><i class = "fas fa-cog"></i>Edit</button>
			</td>
			</tr>
		<% } %>
		</tbody>
		
	</table>
	</div>
</body>
</html>