<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Delete  From Database Using Id</h2>
	<form action="delete-employee.html" method="post" name="ticket_form" onsubmit="return doValidate()">
		<label for="idFlightName"> Enter Employee Id: </label> <input
			type="text" name="empid"> <input type="submit"
			value="Delete Ticket">
	</form>


</body>
</html>