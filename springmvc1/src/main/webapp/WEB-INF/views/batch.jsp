<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to batch</title>
</head>
<body>
	<h1>start and choose and career</h1>
	<h1>goal to achieve with batch</h1>
	<h1>mantor is mandatory to learn</h1>
	<%
	/*String vehicle=(String)request.getAttribute("vehicle");
	Integer swiftdezire=(Integer)request.getAttribute("swiftdezire");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/
	%>
	<h1>
		this is your vehicle
		<%--<%= vehicle %>--%>
		${vehicle }
	</h1>
	<h1>
		your car is come

		<%--<%= swiftdezire %>--%>
		${swiftdezire }
	</h1>
	<h1>
		date and time
		<%--<%= time.toString()%>--%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${revenue }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>