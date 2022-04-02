<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Peoject Manager Panel</title>
	<link rel="stylesheet" href="view.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
 
<div class="wrapper">
    <div class="sidebar">
        <h2>Peoject Manager Panel</h2>
        
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   Employee
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                  
                    <li><a href="ViewEmployeeByprojectManager.html">View Employee </a></li>
                   
                   
                    
                
                </ul>
        </div>
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                    Project
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                   
                    <li><a href="view-project.html">View Project</a></li>
                     <li><a href="deleteproject.jsp">Delete Project</a></li>
                </ul>
        </div>
         <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   Assign Project
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                    <li><a href="assignproject.jsp">Assign Project</a></li>
                    <li><a href="view-assignproject.html">View Project details</a></li>
                     <li><a href="deleteassignproject.jsp">Delete Assign  Project</a></li>
                </ul>
        </div>
        
      
        
       
    </div>
</div>
<div class="topnav">
   <a href="logout.jsp">Logout</a>
</div>
<div class="body_content">

    <h2>Welcome <%=session.getAttribute("projectmanager_login")%></h2>
</div>
</body>
</html>