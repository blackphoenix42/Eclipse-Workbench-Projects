<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/myapp"  
     user="root"  password="password@123"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT uname,email,city,country from user;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>User Name</th>  
<th>Email</th>  
<th>City</th>  
<th>Country</th>  
</tr>  
<c:forEach var="r" items="${rs.rows}">  
<tr>  
<td><c:out value="${r.uname}"/></td>  
<td><c:out value="${r.email}"/></td>  
<td><c:out value="${r.city}"/></td>  
<td><c:out value="${r.country}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html> 