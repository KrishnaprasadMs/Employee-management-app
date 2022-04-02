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
 * Servlet implementation class DeleteProject
 */
public class DeleteProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("projectid"));
		ProjectDAO.deleteProject(id);
		ArrayList<Project> projectlist = ProjectDAO.readAllProjectByID();
		request.setAttribute("projectlist", projectlist);
		request.getRequestDispatcher("DeleteSucces.jsp").forward(request, response);
		
	}

}
