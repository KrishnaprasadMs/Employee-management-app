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
        <div class="navbar">
            <a href="index.jsp">Login</a>
           
          
           
        </div>
 
	<div class="login">
            <div class="login-screen">
                <form  action = "user-registration.html" method="post">
                    <div class="app-title">
			<h1>Register</h1>
                    </div>
                    
                    <div class="login-form">
                     <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="User Id" id="login-id" name="user_id">
                            <label class="login-field-icon fui-key" for="login-id"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Employee name" id="employee-name" name="empname">
                            <label class="login-field-icon fui-user" for="employee-name"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Username" id="login-name" name="name">
                            <label class="login-field-icon fui-user" for="login-name"></label>
                        </div>
                        
                       
                        
                        <div class="control-group">
                            <input type="password" class="login-field" value="" placeholder=" Set Password" id="login-pass" name="password">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="gender" id="login-gender" name="gender">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                        
                        

                        
                        
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="bonus" id="login-bonus" name="bonus">
                            <label class="login-field-icon fui-phone" for="login-bonus"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="basicsalary" id="login-salary" name="basicsalary">
                            <label class="login-field-icon fui-phone" for="login-salary"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Employeestatus" id="login-status" name="employeestatus">
                            <label class="login-field-icon fui-phone" for="login-status"></label>
                        </div>
                            
                        <div class="select-style">
                            <select name="position">
                                <option value="-1"> Select Position</option> 
                                 <option>admin</option> 
                                <option>projectmanager</option>  
  								  <option>user</option>
                            </select>
                        </div>
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Register">
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>




