<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int count,fact,num;  %>
<h1></h1>
<%
	fact=1;
	num=Integer.parseInt(request.getParameter("num"));
	for(count=1;count<=num;count++)
	{
		fact=fact*count;
	}
	out.println("<h3> Factorial result="+fact+"</h3>");
	
%>
<table>
<tr>
<td><% %></td>
</tr>

</table>

</body>
</html>