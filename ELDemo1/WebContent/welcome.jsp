<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table>
<tr><td>First Name:</td><td>${param.fname}</td></tr> <%//request.getParametaer("fname") %>

<tr><td>Middle Name:</td><td>${param.mname}</td></tr>

<tr><td>Last Name:</td><td>${param.lname}</td></tr>

<tr><td>Email:</td><td>${param.email}</td></tr>

<tr><td>Address:</td><td>${param.address}</td></tr>

<tr><td>City:</td><td>${paramValues.city[0]}</td></tr>
</table>
</center>
</body>
</html>