<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html> 
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Project Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" type = "text/css" href = "login.css" />
    </head>
    <body>
       
          
           
        </div>
 
	<div class="login">
            <div class="login-screen">
                <form  action = "edit-assignproject.html" method="post">
                    <div class="app-title">
			<h1>Update Project</h1>
                    </div>
                    
                    <div class="login-form">
                    
  <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("assign_id") %>"   id="end-date" name="assign_id">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>                   
                    
                         <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("emp_id") %>" placeholder="Project name" id="project-name" name="emp_id">
                            <label class="login-field-icon fui-user" for="employee-name"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("project_id") %>" placeholder="Start Date" id="start-date" name="project_id">
                            <label class="login-field-icon fui-user" for="login-name"></label>
                        </div>
                        
                       
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("project_name") %>" placeholder=" End Date " id="end-date" name="project_name">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                      
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("emp_name") %>" placeholder="No of resources required" id="no-of-resources-required" name="emp_name">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="<%=  request.getParameter("manager_id") %>" placeholder="No of resources required" id="no-of-resources-required" name="  manager_id">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                      
                       
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Update">
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>




    