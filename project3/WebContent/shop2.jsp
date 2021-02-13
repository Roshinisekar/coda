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
<h3>Welcome Mr..<%=session.getAttribute("uname") %></h3>
<hr>
<h1>Fruit shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop2">
		<input type="checkbox" name="f34" value="Apple">:Apple
		<input type="checkbox" name="f7" value="Banana">:Banana
		<input type="checkbox" name="f9" value="Orange">:Orange
	
		<input type="submit" value="NextShop...">
	</form>
	
	
</body>
</html>