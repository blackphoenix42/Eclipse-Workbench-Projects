<h4>
<%
session.setAttribute("totalPrice",50000);
    // To display buffersize of the page's JSPWriter,use the expression 
 %>
 
 Buffer Size:  ${pageContext.out.bufferSize}
 
<%
  // To retrive the rquest's HTTP method,use this line of code:
%>
<br>
<br>
Request Method:${pageContext.request.method}
<br>
<br>

Total Price:${sessionScope.totalPrice}

<br>
<br>
Header Data:${header.accept}

<br>
<br>
Request URI:${pageContext.request.requestURI}

<br>
<br>
<%
         // EL OPERATORS 
		  %>
		  <% // Propery Access%>

 Host:    ${header["host"]}<br>
 Host:    ${header['host']}<br>
 Host:    ${header.host}
<br><br>

<% //EL Arithmatic %>

${2*3.14} <br><br>
${1.5e6/1000000}<br><br>
 

 <% // EL relational and logical operator %>


 ${8.5 gt 4} <br><br>

 ${(4 >=9.2) || (1e2 <=63) } <br><br>

 ${(5*5)==25 ? 1: 0}
</h4>