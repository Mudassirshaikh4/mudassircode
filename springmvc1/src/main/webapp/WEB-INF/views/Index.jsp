<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>it is true</h1>
<h1>grand of sons</h1>
<h1>glow to screen</h1>

<%
String section=(String)request.getAttribute("section");
Integer number=(Integer)request.getAttribute("number");
List<String> model1=(List<String>)request.getAttribute("m");
%>

<h1>Section is <%=section %></h1>
<h1>number is <%= number %></h1>
<%
for(String u:model1)
{
%>
<h1><%=u%></h1>
<%
}
%>
</body>  
</html>