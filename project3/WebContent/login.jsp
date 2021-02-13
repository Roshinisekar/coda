<%@page import="java.util.Set"%>
<%@page import="model.ActionError"%>
<%@page import="model.ActionErrors"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amazon</title>
</head>
<body>

<%
		ActionErrors errors=(ActionErrors)request.getAttribute("errors");
		if(errors!=null) {
			Set<ActionError> setofErrors=errors.getError();
			for(ActionError ae:setofErrors) {
				out.println("<h3 style=red>"+ae.error()+"</h3>");
			}
		}
	
		
	%>

	<form action="login.do" method="post">
	<input type="hidden" name="formid" value="login">
		UserName:<input type="text" name="uname">
		PassWord:<input type="password" name="upass">
		
		<input type="submit" value="login..">
	</form>
</body>
</html>