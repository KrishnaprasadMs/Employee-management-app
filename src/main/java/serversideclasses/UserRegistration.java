package serversideclasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.User;
import project.UserDAO;

/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserRegistration() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  User users1 = new User();
		  users1.setEmp_id(Integer.parseInt(request.getParameter("user_id")));
		  users1.setEmp_name(request.getParameter("empname"));
		  users1.setUser_name(request.getParameter("name"));
		  users1.setPassword(request.getParameter("password"));
		  
		  users1.setGender(request.getParameter("gender"));
		  users1.setBonus(request.getParameter("bonus"));
		  users1.setBasic_salary(request.getParameter("basicsalary"));
		  users1.setEmp_status(request.getParameter("employeestatus"));
		  users1.setPosition(request.getParameter("position"));
		 

		
		if(UserDAO.adduser(users1)) {
			request.setAttribute("acc-created-sucessful", "Account Created Sucessfully  Login Here ");
			
			request.getRequestDispatcher("indexsuccess.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("failed-acc-creation", "Error in Creating new Account Contact our Customercare ");
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} 
	}

}
