<%@page import="in.co.rays.bean.Userbeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<hr>
<% Userbeans user =(Userbeans) request.getAttribute("user");%>
<%
if(user!=null){ 
%>
<h3> Hiiii,
<%= user.getF_name() %>

</h3>
<%
		} else {
	%>
	<h3> Hiiii,guest</h3>
	
<%} %>
<hr>



</body>
</html>