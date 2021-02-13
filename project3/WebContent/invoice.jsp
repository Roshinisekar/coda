<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amazon</title>
</head>
<body>
<%@ include file="logout.jsp" %>
<h3>Welcome...Now Make the payment  Mr/Ms..:<%=session.getAttribute("uname") %></h3>
<h4>Selected Items:</h4>
	<%
		Enumeration<String> en=session.getAttributeNames();
		while(en.hasMoreElements()){
			String name=en.nextElement();
			String value=(String)session.getAttribute(name);
			if(!name.equals("formid")&&!name.equals("shopid")&&!name.equals("uname")){
				out.println("<h5>"+name+":"+value+"</h5>");
			}
		}
		session.setMaxInactiveInterval(2);
	%>
	<input type="submit" value="Generate PDF">
</body>
</html>