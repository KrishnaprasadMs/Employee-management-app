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
 * Servlet implementation class DeleteEmployee
 */
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("empid"));
		UserDAO.deleteUser(id);
		ArrayList<User> list = UserDAO.readAllUserByID();
		request.setAttribute("list", list);
		request.getRequestDispatcher("DeleteSucces.jsp").forward(request, response);
		
		
		
	}

}
