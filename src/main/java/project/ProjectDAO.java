package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjectDAO {
	
	public static final String url = "jdbc:sqlite:C:\\Users\\acer\\Desktop\\EmployeeProject\\project.db";
	
	
	/*CREATE TABLE "project" (
	
	"project_name"	TEXT NOT NULL,
	"startdate"	TEXT NOT NULL,
	"enddate"	TEXT NOT NULL,
	"no_of_resources_required"	INTEGER NOT NULL,
	"no_of_resources_allocated"	INTEGER,
	"project_status"	TEXT,
	PRIMARY KEY("project_id" AUTOINCREMENT)
)*/
	
	public static boolean addproject(Project obj) {
		String query = "insert into project(project_name, startdate, enddate,no_of_resources_required,no_of_resources_allocated ,project_status) values( ?, ?, ?, ?, ?, ?)";
		int i = 0;
		boolean isSucessful = false;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
		
			st.setString(1, obj.getProject_name());
			st.setString(2, obj.getStartdate());
			st.setString(3, obj.getEnddate());
			
			st.setInt(4, obj.getNo_of_resources_required());
			
			st.setInt(5, obj.getNo_of_resources_allocated());
			st.setString(6, obj.getProject_status());
			
			

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
	//--------------------------------------------select by id--------------------------------
	
	public static ArrayList<Project> readAllProjectByID() {
		String querry = "select * from project ";
		//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
		ArrayList<Project> projectlist = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Project projectlist1 = new Project(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getInt(6), rs.getString(7));
				projectlist.add(projectlist1);
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
		return projectlist;
	}


	public static boolean updateProjectListbyAdmin(int project_id,String project_name,String startdate,String enddate,int no_of_resources_required,int no_of_resources_allocated,String project_status) {
		
		//  "update movieticket set show = '" + show + "' where movie_id = " + movieId;
		
		String query =  "update 'project' set 'project_name'=?,'startdate'=?,'enddate'=?,'no_of_resources_required'=?,'no_of_resources_allocated'=?,'project_status'=? WHERE 'project_id'=?"; 
				//"Update 'emp' set 'bonus'=?,'basic_salary'=?, WHERE emp_id=?"; 
		
    
    
		try {
			
		               
			System.out.println(query);
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			 st.setString(1, project_name);
			 st.setString(2, startdate);
			 st.setString(3, enddate);
			 st.setInt(4, no_of_resources_required);
			 st.setInt(5, no_of_resources_allocated);
			 st.setString(6, project_status);
			 
			 st.setInt(7, project_id);
			
			
			st.executeUpdate();
			System.out.println("Database connected successfully");
			boolean found = st.execute();
			if(found) {
				System.out.println("One row updated successfully");
	
			}
			else {
				System.out.println("No row found with Employee Id " +project_id);
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
	public static void deleteProject(int id) {
		String deleteQuery = "delete  from project where project_id = "+ id;

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
}
