<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h2>Delete Project Using Assign Id</h2>
	<form action="delete-assignproject.html" method="post" name="ticket_form" onsubmit="return doValidate()">
		<label for="idFlightName"> Enter Project Id: </label> <input
			type="text" name="projectid"> <input type="submit"
			value="Delete Project">
	</form>



</body>
</html>