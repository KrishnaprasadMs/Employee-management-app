

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Employee Panel</title>
	<link rel="stylesheet" href="view.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
 
<div class="wrapper">
    <div class="sidebar">
        <h2>Employee Panel</h2>
        
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   Employee
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                   
                    <li><a href="searchEmployeeByEmployee.jsp">View Employee </a></li>
                    
                   
                    
                
                </ul>
        </div>
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                    Project
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                   
                    <li><a href="searchProjectByEmployee.jsp">View Project</a></li>
                </ul>
        </div>
        
      
        
       
    </div>
</div>
<div class="topnav">
   <a href="logout.jsp">Logout</a>
</div>
<div class="body_content">
   
    <h2>Welcome </h2>
</div>
</body>
</html>