package serversideclasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Project;
import project.ProjectDAO;

/**
 * Servlet implementation class AddProject
 */
public class AddProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		  Project project1 = new Project();
		  
		  
		  project1.setProject_name(request.getParameter("projectname"));
		  project1.setStartdate(request.getParameter("startdate"));
		  project1.setEnddate(request.getParameter("enddate"));
		  project1.setNo_of_resources_required(Integer.parseInt(request.getParameter("noofresourcesrequired")));
		  
		  project1.setNo_of_resources_allocated(Integer.parseInt(request.getParameter("noofresourcesallocated")));
		  
		  project1.setProject_status(request.getParameter("projectstatus"));
		

		
		if(ProjectDAO.addproject(project1)) {
			request.setAttribute("acc-created-sucessful", "Account Created Sucessfully  Login Here ");
			
			request.getRequestDispatcher("adminview.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("failed-acc-creation", "Error in Creating new Account Contact our Customercare ");
			
			request.getRequestDispatcher("assignprojectError.jsp").forward(request, response);
			
		} 
	}

	}


