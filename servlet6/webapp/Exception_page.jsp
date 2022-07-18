<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>something is wrong in the field</title>
<style>
{
padding:0;
margin:0;
}
</style>
</head>
<body>
<div style="background color:red;padding :20px;color:blue">
<h1>something is wrong in the field</h1>
<p><%=exception %></p>
</div>
</body>
</html>