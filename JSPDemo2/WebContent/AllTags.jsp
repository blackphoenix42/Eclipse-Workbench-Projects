<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<b>

<c:out value="Welcome to NIIT"/>  
</br>

<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/>  


<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p> 

 

<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  



<c:set var="num" scope="session" value="${20*2}"/>  
<c:if test="${num> 8}">  
   <p>My num value is: <c:out value="${num}"/><p>  
</c:if>  




<c:set var="salary" scope="session" value="${20000}"/>  
<p>Your Salary is : <c:out value="${salary}"/></p>  
<c:choose>  
    <c:when test="${salary <= 1000}">  
       Salary is not good.  
    </c:when>  
    <c:when test="${salary > 10000}">  
        Salary is very good.  
    </c:when>  
    <c:otherwise>  
       <c:out value="Salary is undetermined..."/>  
    </c:otherwise>  
</c:choose>  
<br />  
<hr/>

<table border="1px">
<th>forEach Result</th>
<c:forEach var="j" begin="10" end="30" step="3">  
<tr><td>  Item <c:out value="${j}"/></td></tr>  
</c:forEach>  
</table>
<br/>
<hr/>


<table border="1px">
<th>forTokens Result</th>
<c:forTokens items="Rahul Nakul Rajesh" delims=" " var="name">  
   <tr><td><c:out value="${name}"/></td></tr> 
</c:forTokens>  
</table>

  </b>
  </center>

</body>
</html>