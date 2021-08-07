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

<%
 	CityDAO cityDao = new CityDAOImplementation();
  City city = cityDao.fetchCity(Integer.parseInt(request.getParameter("id")));
 %>
</head>
<body>

<div class = "container">
	<h1> Edit City</h1>	
	<hr>
	</div>
	<form action = "/Sample/CityOperation" method = "post" class="container">
	<div class="form-group">
		<label for="cityname">City Name:</label>
		<input name="cityname" type = "text" value="<%= city.getName() %>" class ="form-control" placeholder="Enter City Name" id = "cityname">
	</div>
	<input type = "hidden" name = "id" value="<%=city.getId() %>" >
	<input type = "hidden" name = "action" value="update" >
	<br>
	<button type="Submit" class ="btn btn-primary"><i class = "fas fa-cog"></i>Edit</button>
	</form>

</body>
</html>