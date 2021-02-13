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
<h1>Meat shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop3">
		<input type="checkbox" name="m7" value="Mutton">:Mutton
		<input type="checkbox" name="m8" value="Chicken">:Chicken
		<input type="checkbox" name="m9" value="Chops">:beef
	
		<input type="submit" value="Invoice...">
	</form>
	
	
</body>
</html>