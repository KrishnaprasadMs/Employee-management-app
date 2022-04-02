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
 * Servlet implementation class EditEmployeeByAdmin
 */
public class EditEmployeeByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeByAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int emp_id = Integer.parseInt(request.getParameter("emp_id"));
		String bonus = request.getParameter("bonus");
		String basic_salary = request.getParameter("salary");
		boolean t = UserDAO.updateUserListbyAdmin(emp_id, bonus,basic_salary);
		if(t) {
			System.out.println("Updated");
			}
		else {System.out.println("Error while Updating");}
		ArrayList<User> list = UserDAO.readAllUserByID();
		request.setAttribute("list", list);
		request.getRequestDispatcher("adminview.jsp").forward(request, response); 
	}

}
