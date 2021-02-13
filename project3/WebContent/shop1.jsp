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
<h1>Vegetable shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop1">
		<input type="checkbox" name="v1" value="Onion">:Onion
		<input type="checkbox" name="v3" value="Potato">:Potato
		<input type="checkbox" name="v5" value="Tomato">:Tomato
	
		<input type="submit" value="NextShop...">
	</form>
	
	
</body>
</html>