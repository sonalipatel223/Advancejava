<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> my first jsp page....</h1>


<%for(int i =0;i<5;i++) {%>

  <p> <%=i%>my first jsp page....</p>

<% 
} %>

</body>
</html>