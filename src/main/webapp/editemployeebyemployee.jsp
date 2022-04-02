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
      
      
 
	<div class="login">
            <div class="login-screen">
                <form  action = "edituser-byuser.html" method="post">
                    <div class="app-title">
			<h1>Register</h1>
                    </div>
                    
                    <div class="login-form">
                     <div class="control-group">
                            <input type="text" class="login-field" value="<%=request.getParameter("emp_id") %>" placeholder="User Id" id="login-id" name="emp_id">
                            <label class="login-field-icon fui-key" for="login-id"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="<%=request.getParameter("emp_name") %>" placeholder="Employee name" id="employee-name" name="emp_name">
                            <label class="login-field-icon fui-user" for="employee-name"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=request.getParameter("user_name") %>" placeholder="Username" id="login-name" name="user_name">
                            <label class="login-field-icon fui-user" for="login-name"></label>
                        </div>
                        
                       
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=request.getParameter("password") %>" placeholder=" Set Password" id="login-pass" name="password">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="<%=request.getParameter("gender") %>" placeholder="gender" id="login-gender" name="gender">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                     
                       
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Register">
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>




