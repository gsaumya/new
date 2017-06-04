<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Users List</title>
</head>
<body>
	User List:
	<table>
		
			<tr>
				<td><c:out value="${user}" /></td>
				
			</tr>
		
	</table>
</body>
</html>