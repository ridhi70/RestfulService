<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/ControllerInfo" method="get">
	Full name: <input type="text" name="name" required/><br>
	Gender: <input type="radio" name="gender" value="male" checked="checked"> Male
			<input type="radio" name="gender" value="female">Female<br>
	Language Known: <input type="checkbox" name="language" value="English">English
					<input type="checkbox" name="language" value="Hindi">Hindi
					<input type="checkbox" name="language" value="Kannada">Kannada<br>
	Country: <select name="country">
	<option value="India">India</option>
	<option value="USA">USA</option>
	<option value="UK">UK</option>
	<option value="Australia">Australia</option>
	<option value="Finland">Finland</option>
	</select><br>
	<input type="submit" value="submit">
</form>
</body>
</html>