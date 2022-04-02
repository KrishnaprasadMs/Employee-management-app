package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AllocationDAO {
	public static final String url = "jdbc:sqlite:C:\\Users\\acer\\Desktop\\EmployeeProject\\project.db";
	
/*CREATE TABLE "allocation" (
	"assign_id"	INTEGER NOT NULL,
	"emp_id"	INTEGER,
	"project_id"	INTEGER,
	"project_name"	TEXT,
	"emp_name"	TEXT,
	"manager_id"	TEXT,
	FOREIGN KEY("project_id") REFERENCES "project"("project_id"),
	FOREIGN KEY("emp_id") REFERENCES "emp"("emp_id"),
	PRIMARY KEY("assign_id" AUTOINCREMENT)
	
	CREATE TABLE "assign" (
	"assign_id"	INTEGER UNIQUE,
	"emp_id"	INTEGER,
	"project_id"	INTEGER,
	"project_name"	TEXT,
	"emp_name"	TEXT,
	"manager_id"	INTEGER,
	PRIMARY KEY("assign_id" AUTOINCREMENT),
	FOREIGN KEY("project_id") REFERENCES "project"("project_id"),
	FOREIGN KEY("emp_id") REFERENCES "emp"("emp_id")
)
)*/ 
	public static boolean addproject(Allocation obj) {
		String query = "insert into assign(emp_id,project_id,project_name,emp_name,manager_id) values( ?, ?, ?, ?, ?)";
		int i = 0;
		boolean isSucessful = false;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setInt(1, obj.getEmp_id());
			st.setInt(2, obj.getProject_id());
			st.setString(3, obj.getProject_name());
			st.setString(4, obj.getEmp_name());
			st.setInt(5, obj.getManager_id());
			 
			

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
	
public static boolean updateProjectListbyAdmin(int assign_id,int emp_id,int project_id,String project_name,String emp_name,int manager_id) {
		
		//  "update movieticket set show = '" + show + "' where movie_id = " + movieId;
		
		String query =  "update 'assign' set 'emp_id'=?, 'project_id'=?,'project_name'=?,'emp_name'=?,'manager_id'=? WHERE 'assign_id'=?"; 
				//"Update 'emp' set 'bonus'=?,'basic_salary'=?, WHERE emp_id=?"; 
		
    
    
		try {
			
		               
			System.out.println(query);
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			 st.setInt(1, emp_id);
			 st.setInt(2, project_id);
			 st.setString(3, project_name);
			 st.setString(4, emp_name);
			 st.setInt(5, manager_id);
			
			 st.setInt(6, assign_id);
			
			
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
	
	
	
	public static ArrayList<Allocation> readAllProjectByID() {
		String querry = "select * from assign ";
		//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
		ArrayList<Allocation> projectlist = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Allocation projectlist1 = new Allocation(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getInt(6));
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
	
	public static ArrayList<Allocation> readAllProjectByEmployee(int emp_id) {
		String querry = "select * from assign where emp_id=?";
		//"SELECT * FROM movieticket WHERE show='an' OR show='AN' ";
		
		ArrayList<Allocation> projectlist = new ArrayList<>();
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			st.setInt(1,emp_id);
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Allocation projectlist1 = new Allocation(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getInt(6));
				projectlist.add(projectlist1);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return projectlist;
		/*ArrayList<Allocation> projectlist = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Allocation projectlist1 = new Allocation(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getInt(6));
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
		return projectlist; */
	}
	public static void deleteProject(int id) {
		String deleteQuery = "delete  from assign where assign_id = "+ id;

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
	
}
