
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Admin Panel</title>
	<link rel="stylesheet" href="view.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
 
<div class="wrapper">
    <div class="sidebar">
        <h2>Admin</h2>
        
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   Employee
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                    <li><a  href="registerform.jsp">Add Employee</a></li>
                    <li><a href="view-employee.html">View Employee </a></li>
                     <li><a href="editemployee.jsp">Edit Employee</a></li>
                    <li><a href="deleteEmployee.jsp">Delete Employee </a></li>
                    
                
                </ul>
        </div>
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                    Project
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                    <li><a href="addproject.jsp">Add Project</a></li>
                    <li><a href="view-project.html">View Project</a></li>
                  
                    <li><a href="deleteproject.jsp">Delete Project</a></li>
                </ul>
        </div>
        
      
        
       
    </div>
</div>
<div class="topnav">
    <a href="logout.jsp">Logout</a>
</div>
<div class="body_content">
    <h2>Welcome <%=session.getAttribute("admin_login")%></h2>
</div>
</body>
</html>