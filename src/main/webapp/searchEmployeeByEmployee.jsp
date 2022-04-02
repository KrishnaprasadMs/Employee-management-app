<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>View Employee Details</h2>
	<form action="user-view-by-employee.html" method="post" name="ticket_form_update" onsubmit="return doValidate2()">
		<label for="idFlightName"> Enter Employee Id: </label> <input
			type="text" name="ticketUpdateId"> 
			
			<input type="submit" value="view">
	</form>
</body>
</html>