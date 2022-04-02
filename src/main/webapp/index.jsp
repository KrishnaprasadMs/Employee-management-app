
<!DOCTYPE html> 
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title> Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" type = "text/css" href = "login.css" />
        
                <style>
        * {
box-sizing: border-box;
}

*:focus {
	outline: none;
}
body {
font-family: Arial;
background-color: gray;
padding: 0px;
}

.navbar {
  overflow: hidden;
  background-color: black;
}

.navbar a {
  float: right;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: right;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: #3498DB;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: #ddd;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}


.login {
margin: 20px auto;
width: 300px;
}
.login-screen {
background-color: #FFF;
padding: 20px;
border-radius: 5px
}

.app-title {
text-align: center;
color: #777;
}

.login-form {
text-align: center;
}
.control-group {
margin-bottom: 10px;
}

input {
text-align: center;
background-color: #ECF0F1;
border: 2px solid transparent;
border-radius: 3px;
font-size: 16px;
font-weight: 200;
padding: 10px 0;
width: 250px;
transition: border .5s;
}

input:focus {
border: 2px solid black;
box-shadow: none;
}

.btn {
  border: 2px solid transparent;
  background: black;
  color: #ffffff;
  font-size: 16px;
  line-height: 25px;
  padding: 10px 0;
  text-decoration: none;
  text-shadow: none;
  border-radius: 3px;
  box-shadow: none;
  transition: 0.25s;
  display: block;
  width: 250px;
  margin: 0 auto;
}

.btn:hover {
  background-color: slategray;
}

.login-link {
  font-size: 12px;
  color: #444;
  display: block;
	margin-top: 12px;
}

.select-style {
   
    width: 250px;
    height:45px;
    border: 1px solid #ccc;
    margin-left:5px;
    margin-bottom: 10px;
    border-radius: 3px;
    overflow: hidden;
    background-color: #ECF0F1;
}

.select-style select {
    
    font-family: Arial;
    font-size: 16px;
    font-weight: 200;
    padding: 5px 8px 0px 90px;
    width: 100%;
    border: none;
    box-shadow: none;
    background: transparent;
    background-image: images.jpg;
    color:grey;
}

.select-style select:focus {
    outline: none;
}

        
        </style>
    </head>
    <body>
        <div class="navbar">
            <a href="registerform.jsp">Register</a>
           
           
            </div> 
           
     

	<div class="login">
            <div class="login-screen">
                <form  action = "loginsuccess.jsp" method="post">
                    <div class="app-title">
			<h1>Login</h1>
                    </div>
                    
                    <div class="login-form">
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Username" id="login_name" name="name">
                            <label class="login-field-icon fui-user" for="login_name"></label>
                        </div>

                        <div class="control-group">
                            <input type="password" class="login-field" value="" placeholder="password" id="login-pass" name="password">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                            
                        <div class="select-style">
                            <select name="position">
                                <option value="-1">Position</option> 
                                <option>admin</option>  
                                <option>projectmanager</option>  
                                <option>user</option> 
                                
                            </select>
                        </div>
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="login">
                       
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>
