<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login Page </title>
</head>
<body>
	<form method = "post" action = "LoginCheck">
		<table>
			<tr>
				<td> User ID </td>
				<td> <input type = "text" name = "userID"> </td>
			</tr>
			<tr>
				<td> Password </td>
				<td> <input type = "password" name = "password"> </td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type = "submit" value = "login"> </td>
			</tr>
		</table>
	</form>
</body>
</html>