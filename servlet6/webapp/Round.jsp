<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="Exception_page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>please get the page</title>
</head>
<body>
	<h1>present the report</h1>
	<%!
	int a=16;
	int b=0;
    %>
    <%
    int division =a/b;
    %>
  <h1>Division : <%=division %></h1>
</body>
</html>