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
 * Servlet implementation class ReadAllProjectByEmployee
 */
public class ReadAllProjectByEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAllProjectByEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int emp_id = Integer.parseInt(request.getParameter("ticketUpdateId"));
		ArrayList<Allocation> projectlist = AllocationDAO.readAllProjectByEmployee(emp_id);
		request.setAttribute("projectlist", projectlist);
		request.getRequestDispatcher("viewassignedprojectbyEmployee.jsp").forward(request, response);
	}

}
