<%@page import="com.niit.dao.UserDao"%>
<jsp:useBean id="u" class="com.niit.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>