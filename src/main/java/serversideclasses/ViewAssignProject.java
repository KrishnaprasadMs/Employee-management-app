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
 * Servlet implementation class ViewAssignProject
 */
public class ViewAssignProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAssignProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Allocation> projectlist = AllocationDAO.readAllProjectByID();
		request.setAttribute("projectlist", projectlist);
		request.getRequestDispatcher("viewassign.jsp").forward(request, response);
	}

}
