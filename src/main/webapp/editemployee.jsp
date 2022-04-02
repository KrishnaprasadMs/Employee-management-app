<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Insert titlee her</title>
<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" type = "text/css" href = "login.css" />
</head>

<body>
  <h2>Update  Using Id</h2>
  
		
  
	<form action="edit-employeebyadmin.html" method="post" name="ticket_form_update" onsubmit="return doValidate()">
	
         
	<div class="login-form">
		<label for="idFlightName"> Enter  Id: </label> <input
			type="text" name="emp_id" value="<%=request.getParameter("emp_id") %>"> 
			<label for="idFlightName"> Enter Bonus: </label>
			<input type="text" name="bonus" value="<%=request.getParameter("bonus") %>" > 
			<label for="idFlightName"> Enter Basic Salary: </label>
			<input type="text" name="salary"  value="<%=request.getParameter("salary") %>"> 
			<input  type="submit" value="Update" >
			
			
						
	</form>
</body>
</html> 
     
                  
                        
                        

