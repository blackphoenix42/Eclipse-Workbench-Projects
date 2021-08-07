<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Format Functions</title>
</head>
<body>
<c:set var="Amount" value="9850.14115" /><br>
<c:out value="${Amount}"></c:out><br> 
<fmt:formatNumber value="${Amount}" type="currency" /><br>
<fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /><br>
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /><br>
<fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /><br>
<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /><br>
<fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /><br>
==============================================================================================<br/>
<c:set var="newPassword" value="HelloPassNew" />
<c:set var="oldPassword" value="HelloPass"/>
<c:if test="${fn:contains(newPassword, oldPassword)}"> <!-- containsIgnorXase(,) will ignore the case -->
 <c:out value="New Password should not contain old password as substring"/>
</c:if>
==============================================================================================<br/>
${fn:indexOf("My name is Ayush", "ayush")}<br/>
${fn:indexOf("My name is Ayush", "Ayush")}<br/>
${fn:indexOf("This is an example", "is")}<br/>
==============================================================================================<br/>
<%String arr[]={"hi", "hello", "how"};
session.setAttribute("names", arr);
%>
${fn:join(names, " & ")}<br/>
==============================================================================================<br/>
<c:set var="msg" value="This is an example"/>
<c:set var="arrayofmsg" value="${fn:split(msg,' ')}"/>
<c:forEach var="i" begin="0" end="3">
arrayofmsg[${i}]: ${arrayofmsg[i]}<br>
</c:forEach>
==============================================================================================<br/>
<c:set var="string1" value="string1"/>
Length of String1 is: ${fn:length(string1)}<br>
==============================================================================================<br/>
<c:set var="mymsg" value=" This is the test String       "/>
${fn:trim(mymsg)}<br/>
==============================================================================================<br/>
<c:set var="mymsg" value="Example of JSTL function"/>
The string starts with "Example": ${fn:startsWith(mymsg, 'Example')}<br> <!-- Same with endsWith() -->
==============================================================================================<br/>
<c:set var="s" value="This is an example of JSTL function"/>
${fn:substring(s, 10, 26)}<br> <!-- substringAfter() & substringBefore() presents the remaining string after and before the input string -->
==============================================================================================<br/>
<c:set var="name" value="Ayush"/>
Hi This is ${fn:toUpperCase(name)}.<br> <!-- toLowerCase() converts to lower case  -->
==============================================================================================<br/>
<c:set var="randomstring" value="abc def abc ghi ABC"/>
${fn:replace(randomstring, "abc", "hello")}
</body>
</html>