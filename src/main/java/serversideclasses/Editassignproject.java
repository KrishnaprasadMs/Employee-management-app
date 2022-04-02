package serversideclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Allocation;
import project.AllocationDAO;

/**
 * Servlet implementation class Editassignproject
 */
public class Editassignproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editassignproject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int  assign_id = Integer.parseInt(request.getParameter("assign_id"));
		int  emp_id = Integer.parseInt(request.getParameter("emp_id"));
		int  project_id = Integer.parseInt(request.getParameter("project_id"));
		String project_name = request.getParameter("project_name");
		String emp_name = request.getParameter("emp_name");
		
		int manager_id =  Integer.parseInt(request.getParameter("manager_id"));
		
	
		boolean t = AllocationDAO.updateProjectListbyAdmin(assign_id,emp_id,project_id,project_name, emp_name, manager_id);
		if(t) {
			System.out.println("Updated");
			}
		else {System.out.println("Error while Updating");}
		ArrayList<Allocation> projectlist = AllocationDAO.readAllProjectByID();
		request.setAttribute("projectlist", projectlist);
		request.getRequestDispatcher("viewassign.jsp").forward(request, response);
	}
	}


