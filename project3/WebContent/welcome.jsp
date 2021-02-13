<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amazon</title>
</head>
<body>
<hr>
<%@ include file="logout.jsp" %>
<hr>
	<h4>Welcome....:<%=session.getAttribute("uname")%></h4>
	<h1>Welcome to Amazon shopping site...</h1>
	<form action="shop.do">
		<input type="hidden" name="formid" value="shop">
		CustomerName:<input type="text" name="cname">
		CustomerAddress:<input type="text" name="cadd">
		<input type="submit" value="Do shopping...">
	</form>
</body>
</html>