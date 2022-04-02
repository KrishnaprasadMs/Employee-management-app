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


<tr><th>Employee Id</th><th> Employee Name</th><th>User Name</th><th>Password</th><th>Designation</th>  
<th>Gener</th><th>Bonus</th><th>Basic Salary</th><th>Employee Status</th><th>Edit</th></tr>  


<%
		for (int I = 0; I < userlist.size(); I++) {
			
		
		%>
		<tr>
			<td><%=userlist.get(I).getEmp_id()%></td>
			<td><%=userlist.get(I).getEmp_name()%></td>
			<td><%=userlist.get(I).getUser_name()%></td>
			<td><%=userlist.get(I).getPassword()%></td>
			<td><%=userlist.get(I).getPosition()%></td>
			<td><%=userlist.get(I).getGender()%></td>
			<td><%=userlist.get(I).getBonus()%></td>
			<td><%=userlist.get(I).getBasic_salary()%></td>
			<td><%=userlist.get(I).getEmp_status()%></td>
			<td><a href="editemployee.jsp?emp_id=<%=userlist.get(I).getEmp_id()%> &bonus=<%=userlist.get(I).getBonus()%>&salary=<%=userlist.get(I).getBasic_salary()%>">Edit</a></td>
		
			
			
			
 
			 
		</tr>
		<%
		}
		%>



 
</table>  
 


  								  <a href="adminview.jsp">back</a>

  
</body>  
</html>  