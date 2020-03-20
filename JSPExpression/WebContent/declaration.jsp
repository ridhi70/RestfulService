<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration</title>
</head>
<body>
<%! public int x=5;
String message(){
	return "how you doin??";
}
%>

<%= x %>
<%= message() %>


</body>
</html>