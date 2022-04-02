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
 
<h1>Project List</h1>  
<link rel="stylesheet" href="table.css">
  
<%  
ArrayList<Allocation> projectlist = (ArrayList<Allocation>)request.getAttribute("projectlist");  

%>  
  
<table border="1" style="width:83%;margin-left:220px;margin-right:20px;"> 


<tr><th>Assign Id</th><th> Employee ID</th><th>Project ID</th><th>Project Name</th><th>Employee Name</th>  
<th>project Manager Id</th><th>Edit</th> </tr>  
<%
		for (int I = 0; I < projectlist.size(); I++) {
		%>


		<tr>
			<td><%=projectlist.get(I).getAssign_id()%></td>
			<td><%=projectlist.get(I).getEmp_id()%></td>
			<td><%=projectlist.get(I).getProject_id()%></td>
			<td><%=projectlist.get(I).getProject_name()%></td>
			<td><%=projectlist.get(I).getEmp_name()%></td>
			<td><%=projectlist.get(I).getManager_id()%></td>
			<td><a href="editAssignproject.jsp?assign_id=<%=projectlist.get(I).getAssign_id()%>&emp_id=<%=projectlist.get(I).getEmp_id()%>&project_id=<%=projectlist.get(I).getProject_id()%>&project_name=<%=projectlist.get(I).getProject_name()%>&emp_name=<%=projectlist.get(I).getEmp_name()%>&manager_id=<%=projectlist.get(I).getManager_id()%>">Edit</a></td>
		
		
			
		</tr>
		<%
		}
		%>

 

 
</table>  
 


  								 

  
</body>  
</html>  