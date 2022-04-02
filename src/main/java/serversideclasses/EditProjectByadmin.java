package serversideclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Project;
import project.ProjectDAO;

/** 
 * Servlet implementation class EditProjectByadmin
 */
public class EditProjectByadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String startdate;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProjectByadmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int  project_id = Integer.parseInt(request.getParameter("projectid"));
		String project_name = request.getParameter("projectname");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		int no_of_resources_required =  Integer.parseInt(request.getParameter("noofresources"));
		int no_of_resources_allocated =  Integer.parseInt(request.getParameter("noofresourcesallocated"));
		String project_status = request.getParameter("status");
	
		boolean t = ProjectDAO.updateProjectListbyAdmin( project_id, project_name, startdate, enddate,no_of_resources_required,no_of_resources_allocated,project_status);
		if(t) {
			System.out.println("Updated");
			}
		else {System.out.println("Error while Updating");}
		ArrayList<Project> projectlist = ProjectDAO.readAllProjectByID();
		request.setAttribute("projectlist", projectlist);
		request.getRequestDispatcher("adminview.jsp").forward(request, response);
	}

}
