<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Employee List</title>  
</head>  
<body>  
  

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page import="serversideclasses.*"%>
<%@ page import="project.*,java.util.*"%> 
<%@page import="java.util.ArrayList" %>
 
<h1>Employee List</h1>  
<link rel="stylesheet" href="table.css">
  
<%  
ArrayList<User> userlist = (ArrayList<User>)request.getAttribute("userlist");  

%>  
  
<table border="1" style="width:83%;margin-left:220px;margin-right:10px;"> 


<tr><th>Employee Id</th><th> Employee Name</th><th>Designation</th>  
<th>Employee Status</th></tr>  


<%
		for (int I = 0; I < userlist.size(); I++) {
			
		
		%>
		<tr>
			<td><%=userlist.get(I).getEmp_id()%></td>
			<td><%=userlist.get(I).getEmp_name()%></td>
			
			<td><%=userlist.get(I).getPosition()%></td>
			
			<td><%=userlist.get(I).getEmp_status()%></td>
		
			
			
			
 
			 
		</tr>
		<%
		}
		%> 



 
</table>  
 


  							

  
</body>  
</html>  