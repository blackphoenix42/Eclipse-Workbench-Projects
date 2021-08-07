<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp" method="post">
<center>
<table border="1px">
<tr><td>First Name:</td><td><input type="text" name="fname"></td></tr>

<tr><td>Last Name:</td><td><input type="text" name="lname"></td></tr>

<tr><td>Middle Name:</td><td><input type="text" name="mname"></td></tr>

<tr><td>Email:</td><td><input type="email" name="email"></td></tr>

<tr><td>Address:</td><td> <input type="textarea" name="address"> </td></tr>

<tr>
<td>City:</td>
<td><select name="city" multiple="multiple">
<option value="Pune">Pune</option>
<option value="Satara">Satara</option>
<option value="Solapur">Solapur</option>
<option value="Sangli">Sangli</option>
<option value="Nagar">Nagar</option>
</select>
</td>
</tr>
<tr><td></td><td><input type="submit" value="Register"></td></tr>
</table>
</center>
</form>

</body>
</html>