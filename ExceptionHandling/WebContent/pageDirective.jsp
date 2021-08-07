<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="javax.servlet.*,java.rmi.*,java.util.*" session="true"
	buffer="12kb" autoFlush="true" info="my page directive jsp"
	errorPage="error.jsp" isThreadSafe="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		String name = request.getParameter("uname");
	if (name == null || "".equals(name)) {
		throw new RuntimeException("It is not a string");
	} else {
	%>
	<h2>Page directive test page</h2>
	<h5>This is a JSP to test the page dierctive</h5>
	<%
		}
	%>

</body>
</html>