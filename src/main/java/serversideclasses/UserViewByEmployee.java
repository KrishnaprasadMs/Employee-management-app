package serversideclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.Allocation;
import project.AllocationDAO;
import project.User;
import project.UserDAO;

/**
 * Servlet implementation class UserViewByEmployee
 */
public class UserViewByEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserViewByEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		int emp_id = Integer.parseInt(request.getParameter("ticketUpdateId"));
		
		ArrayList<User> userlist2 = UserDAO.readUserListByEmployee(emp_id);
		request.setAttribute("userlist2", userlist2);
		request.getRequestDispatcher("viewemployeebyEmployee.jsp").forward(request, response);
	}

}
