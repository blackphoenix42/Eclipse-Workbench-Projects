<%@page import="java.util.Date"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Data File</title>
  </head>
  <body>
    <h1 style="color: blue">
      Hello <%= request.getParameter("uname")%>,How are you?
    </h1>
    Today is <%= new Date() %>
  </body>
</html>