<%@page import="com.niit.dao.UserDao"%>
<jsp:useBean id="u" class="com.niit.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.update(u);
response.sendRedirect("viewusers.jsp");
%>