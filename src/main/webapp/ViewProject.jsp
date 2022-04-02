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
ArrayList<Project> projectlist = (ArrayList<Project>)request.getAttribute("projectlist");  

%>  
  
<table border="1" style="width:83%;margin-left:220px;margin-right:20px;"> 


<tr><th>Project Id</th><th> Project Name</th><th>Start Date</th><th>End Date</th><th>No Of Resources Required</th>  
<th>No Of Resources Allocated</th><th>Project Status</th><th>Actions</th> </tr>  
<%
		for (int I = 0; I < projectlist.size(); I++) {
		%>


		<tr>
		
			<td><%=projectlist.get(I).getProject_id()%></td>
			<td><%=projectlist.get(I).getProject_name()%></td>
			<td><%=projectlist.get(I).getStartdate()%></td>
			<td><%=projectlist.get(I).getEnddate()%></td>
			<td><%=projectlist.get(I).getNo_of_resources_required()%></td>
			<td><%=projectlist.get(I).getNo_of_resources_allocated()%></td>
			<td><%=projectlist.get(I).getProject_status()%></td>
<td><a href="editeproject.jsp?projectid=<%=projectlist.get(I).getProject_id()%>&projectname=<%=projectlist.get(I).getProject_name()%>&startdate=<%=projectlist.get(I).getStartdate()%>&enddate=<%=projectlist.get(I).getEnddate()%>&noofresources=<%=projectlist.get(I).getNo_of_resources_required()%>&noofresourcesallocated=<%=projectlist.get(I).getNo_of_resources_allocated()%>&status=<%=projectlist.get(I).getProject_status()%>">Edit</a></td>
		
			
		</tr>
		<%
		}
		%>

 

 
</table>  
 


  							

  
</body>  
</html>  