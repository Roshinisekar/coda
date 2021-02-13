<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon</title>
</head>
<body>
	<form action="already.do" method="post">
	<input type="hidden" name="formid" value="already">
	Username:<input type="text" name="uname">
	Password:<input type="password" name="upass">
	
	<input type="submit" value="login">
	</form>

</body>
</html>