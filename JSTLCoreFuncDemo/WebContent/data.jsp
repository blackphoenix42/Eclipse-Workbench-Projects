<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>

<c:set var="num" value="15"></c:set>
Number = <c:out value="${num}"></c:out><br>

<c:forEach var="i" begin="1" end="10" step="2">
${i} <br>
</c:forEach>

<c:if test="${num>10}">
<h4>num is greater than 10</h4>
<c:out value="num greater than 10"></c:out>
</c:if> 

</body>
</html>