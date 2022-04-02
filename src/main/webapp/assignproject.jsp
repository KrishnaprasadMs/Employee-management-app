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
                <form  action = "add-allocation.html" method="post">
                    <div class="app-title">
			<h1>Assign project to Employee</h1>
                    </div>
                    
                    <div class="login-form">
                     <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Empoyee Id" id="login-id" name="emp_id">
                            <label class="login-field-icon fui-key" for="login-id"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Project Id" id="employee-name" name="project_id">
                            <label class="login-field-icon fui-user" for="employee-name"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Projectname" id="login-name" name="project_name">
                            <label class="login-field-icon fui-user" for="login-name"></label>
                        </div>
                        
                       
                        

                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="employee_name" id="login-gender" name="emp_name">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                        
                        

                        
                        
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Manager Id" id="login-bonus" name="manager_id">
                            <label class="login-field-icon fui-phone" for="login-bonus"></label>
                        </div>

                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Assign">
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>