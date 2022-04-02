package serversideclasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Allocation;
import project.AllocationDAO;
import project.Project;
import project.ProjectDAO;

/**
 * Servlet implementation class AddAllocation 
 */
public class AddAllocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAllocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  Allocation project1 = new Allocation();
		  project1.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
		  project1.setProject_id(Integer.parseInt(request.getParameter("project_id")));
		  
		  project1.setProject_name(request.getParameter("project_name"));
		  project1.setEmp_name(request.getParameter("emp_name"));
		  project1.setManager_id(Integer.parseInt(request.getParameter("manager_id")));
		 

		
		if(AllocationDAO.addproject(project1)) {
			request.setAttribute("acc-created-sucessful", "Account Created Sucessfully  Login Here ");
			
			request.getRequestDispatcher("assignsuccess.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("failed-acc-creation", "Error in Creating new Account Contact our Customercare ");
			
			request.getRequestDispatcher("assignprojectError.jsp").forward(request, response);
			
		} 
		 
	} }

