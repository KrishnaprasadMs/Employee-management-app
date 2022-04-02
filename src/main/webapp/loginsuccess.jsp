<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%
        if(session.getAttribute("admin_login")!=null)
        {
            response.sendRedirect("adminview.jsp");
        } 
    if(session.getAttribute("projectmanager_login")!=null)
    {
        response.sendRedirect("projectmanagerview.jsp"); 
    }
       
        if(session.getAttribute("user_login")!=null)
        {
            response.sendRedirect("userview.jsp");
        }
        if(request.getParameter("btn_login")!=null)
        {
            String name,password,position;
            name=request.getParameter("txt_name");
          //  user_id=request.getParameter("txt_user_id");
            password=request.getParameter("txt_password");
            position=request.getParameter("txt_position");
        }
        
        try
        {
            String name=request.getParameter("name");
          //  String user_id=request.getParameter("user_id");
            String password=request.getParameter("password");
            String position=request.getParameter("position");
            
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\acer\\Desktop\\EmployeeProject\\project.db");
            PreparedStatement pstmt=null;
            
            pstmt=con.prepareStatement("select * from emp where user_name=? and password=? and position=?");
            pstmt.setString(1,name);
          //  pstmt.setString(2,user_id);
            pstmt.setString(2,password);
            pstmt.setString(3,position);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                String dbname=rs.getString("user_name");
            //    String dbuser_id=rs.getString("user_id");
                String dbpassword=rs.getString("password");
                String dbposition=rs.getString("position");
                if(name.equals(dbname) && password.equals(dbpassword) && position.equals(dbposition))
                { 
                    if(position.equals("admin"))
                    {
                        session.setAttribute("admin_login",dbname);
                        response.sendRedirect("adminview.jsp");
                    }
                    else if(position.equals("projectmanager"))
                    {
                        session.setAttribute("projectmanager_login",dbname);
                        response.sendRedirect("projectmanagerview.jsp");
                    }
                   
                    else if(position.equals("user"))
                    {
                        session.setAttribute("User_login",dbname);
                        response.sendRedirect("userview.jsp");
                    }
                }
            }
            else
            {
                out.print("Inavlid User ");
                response.sendRedirect("indexerror.jsp");
           }
            pstmt.close();
            con.close();
        }
        catch(Exception e){e.printStackTrace();
        }  
    %>