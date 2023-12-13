<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="LoginCtl " method="post">
<%@include file = "Header.jsp" %>

<%String msg =  (String)request.getAttribute("msg"); %>
<table>
<tr>
<% if (msg!=null){ %>
<%=msg %>
<% } %>



<th>Login Id</th>
<td><input type="text" name="loginId"></td>
</tr>

<tr>
<th>Password</th>
<td><input type="text" name="password"></td>
</tr>

<th></th>

<td><button>submit</button></td> 

</table>
</form>



</body>
</html>