package serversideclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.User;
import project.UserDAO;

/**
 * Servlet implementation class ViewEmployeeByprojectManager
 */
public class ViewEmployeeByprojectManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployeeByprojectManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ArrayList<User> userlist = UserDAO.readAllUserList();
		request.setAttribute("userlist", userlist);
		request.getRequestDispatcher("ViewEmployeeByManager.jsp").forward(request, response);
	}

}
