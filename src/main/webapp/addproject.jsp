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
                <form  action = "add-project.html" method="post">
                    <div class="app-title">
			<h1>Add Project</h1>
                    </div>
                    
                    <div class="login-form">
                    
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Project name" id="project-name" name="projectname">
                            <label class="login-field-icon fui-user" for="employee-name"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Start Date" id="start-date" name="startdate">
                            <label class="login-field-icon fui-user" for="login-name"></label>
                        </div>
                        
                       
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder=" End Date " id="end-date" name="enddate">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="No of resources required" id="no-of-resources-required" name="noofresourcesrequired">
                            <label class="login-field-icon fui-phone" for="login-gender"></label>
                        </div>
                        
                        

                        
                        
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="No of resources allocated" id="no-of-resources-allocated" name="noofresourcesallocated">
                            <label class="login-field-icon fui-phone" for="login-bonus"></label>
                        </div>
                         <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="project status" id="project_status" name="projectstatus">
                            <label class="login-field-icon fui-phone" for="login-salary"></label>
                        </div>
                        
                            
                       
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Add">
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>




    