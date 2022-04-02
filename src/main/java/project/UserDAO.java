package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.*;

public class UserDAO {
	public static final String url = "jdbc:sqlite:C:\\Users\\acer\\Desktop\\EmployeeProject\\project.db";
	
//	--------------------------------------- View Employee By Employe------------------------------------------
	public static ArrayList<User> readUserListByEmployee(int emp_id) {
//	
	
		
			String querry = "select *from emp  where emp_id=?";
			
			//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
			ArrayList<User> userlist2 = new ArrayList<>();
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement st = conn.prepareStatement(querry);
				st.setInt(1,emp_id);
				
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
	 				User userlist = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9));
					userlist2.add(userlist);
				}		
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1. Register/Load Driver
			catch (SQLException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return userlist2; 
		}	

	
// ------------------------------------------   select employee by designation -------------------------//	
	public static ArrayList<User> readAllUserList() {
	//	String querry = "select emp_id,emp_name,user_name,password,gender,bonus,basic_salary,emp_status ,position from emp ";
		 String querry = "select * from emp where position='user'  OR position='projectmanager'";
		//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
		ArrayList<User> userlist = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				User userlist1 = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9));
				userlist.add(userlist1);
				
			}		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1. Register/Load Driver
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist; 
	}
	
	
	//--------------------------------------------select by id--------------------------------
	
	public static ArrayList<User> readAllUserByID() {
		
		String querry = " select * from emp";
		//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
		ArrayList<User> list = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				User list1 = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),rs.getString(9));
				list.add(list1);
			}		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1. Register/Load Driver
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

    
	
	


	
	
	

	public static boolean updateUserListbyAdmin(int emp_id,String bonus,String basic_salary) {
		
		//  "update movieticket set show = '" + show + "' where movie_id = " + movieId;
		
		String query = "UPDATE emp SET bonus = ? , "
		        + "basic_salary = ? "
		        + "WHERE emp_id = ?";
				//"Update 'emp' set 'bonus'=?,'basic_salary'=?, WHERE emp_id=?"; 
		try {
			
		               
			System.out.println(query);
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			
			 st.setString(1, bonus);
			 st.setString(2, basic_salary);
			 st.setInt(3, emp_id);
			st.executeUpdate();
			System.out.println("Database connected successfully");
			boolean found = st.execute();
			if(found) {
				System.out.println("One row updated successfully");
	
			}
			else {
				System.out.println("No row found with Employee Id " +emp_id);
			}
			conn.close();
			System.out.println("Database disconnected successfully");
			return true;
		} 
		catch (SQLException e) {
			System.out.println("Error in updated the row");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	//-------------------------------update by employee--------------------
public static boolean updateUserListbyemployee(int emp_id,String emp_name,String user_name,String password,String gender) {
	
	/*
	CREATE TABLE "emp" (
	"emp_id"	INTEGER NOT NULL UNIQUE,
	"emp_name"	TEXT,
	"user_name"	TEXT,
	"password"	TEXT,
	"gender"	TEXT,
	"bonus"	TEXT,
	"basic_salary"	TEXT,
	"emp_status"	TEXT,
	"position"	TEXT, */    


		
		//  "update movieticket set show = '" + show + "' where movie_id = " + movieId;
		
		String query = "UPDATE emp SET emp_name = ? , "
		        + "user_name = ? "
		        + "password = ? "
		        + "gender = ? "
		        + "WHERE emp_id = ?";
				//"Update 'emp' set 'bonus'=?,'basic_salary'=?, WHERE emp_id=?"; 
		try {
			
		               
			System.out.println(query);
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			
			 st.setString(1, emp_name);
			 st.setString(2, user_name);
			 st.setString(2, password);
			 st.setString(2, gender);
			 st.setInt(3, emp_id);
			
			
			
			
			st.executeUpdate();
			System.out.println("Database connected successfully");
			boolean found = st.execute();
			if(found) {
				System.out.println("One row updated successfully");
	
			}
			else {
				System.out.println("No row found with Employee Id " +emp_id);
			}
			conn.close();
			System.out.println("Database disconnected successfully");
			return true;
		} 
		catch (SQLException e) {
			System.out.println("Error in updated the row");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	
	//-------------------------------------------------------Delete------------------------------------------
	public static void deleteUser(int id) {
		String deleteQuery = "delete  from emp where emp_id = "+ id;

		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(deleteQuery);
			System.out.println("Database connected successfully");
//			st.setInt(1, id);
			st.execute();
			System.out.println("One row Deleted successfully");
			conn.close();
			System.out.println("Database disconnected successfully");
		} catch (SQLException e) {
			System.out.println("Error in Deleted the row");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	 		e.printStackTrace();
		}
		System.out.println("End of program");
	}
	//------------------------------------------
	
	
	//------------------------------------------  */
	
	

	
	
	public static boolean adduser(User obj) {
		String query = "insert into emp(emp_id, emp_name, user_name, password,gender,bonus ,basic_salary ,emp_status,position) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int i = 0;
		boolean isSucessful = false;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setInt(1, obj.getEmp_id());
			st.setString(2, obj.getEmp_name());
			st.setString(3, obj.getUser_name());
			st.setString(4, obj.getPassword());
			
			st.setString(5, obj.getGender());
			
			st.setString(6, obj.getBonus());
			st.setString(7, obj.getBasic_salary());
			st.setString(8, obj.getEmp_status());
			st.setString(9, obj.getPosition());
			
			

			i = st.executeUpdate();
			if (i != 0) {
				isSucessful = true;
			}
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return isSucessful;
	}
	
	
	

}
