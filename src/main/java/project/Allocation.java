package project;

import java.util.Objects;

public class Allocation {
	/*CREATE TABLE "assign" (
	"assign_id"	INTEGER UNIQUE,
	"emp_id"	INTEGER,
	"project_id"	INTEGER,
	"project_name"	TEXT,
	"emp_name"	TEXT,
	"manager_id"	INTEGER,
	PRIMARY KEY("assign_id" AUTOINCREMENT),
	FOREIGN KEY("project_id") REFERENCES "project"("project_id"),
	FOREIGN KEY("emp_id") REFERENCES "emp"("emp_id")
);
		)*/
	
	private int assign_id;
	private int emp_id;
	private int project_id;
	private String project_name;
	private String emp_name; 
	private int manager_id;
	public int getAssign_id() {
		return assign_id;
	}
	public void setAssign_id(int assign_id) {
		this.assign_id = assign_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(assign_id, emp_id, emp_name, manager_id, project_id, project_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Allocation other = (Allocation) obj;
		return assign_id == other.assign_id && emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name)
				&& manager_id == other.manager_id && project_id == other.project_id
				&& Objects.equals(project_name, other.project_name);
	}
	@Override
	public String toString() {
		return "Allocation [assign_id=" + assign_id + ", emp_id=" + emp_id + ", project_id=" + project_id
				+ ", project_name=" + project_name + ", emp_name=" + emp_name + ", manager_id=" + manager_id
				+ ", getAssign_id()=" + getAssign_id() + ", getEmp_id()=" + getEmp_id() + ", getProject_id()="
				+ getProject_id() + ", getProject_name()=" + getProject_name() + ", getEmp_name()=" + getEmp_name()
				+ ", getManager_id()=" + getManager_id() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	public Allocation(int assign_id, int emp_id, int project_id, String project_name, String emp_name, int manager_id) {
		super();
		this.assign_id = assign_id;
		this.emp_id = emp_id;
		this.project_id = project_id;
		this.project_name = project_name;
		this.emp_name = emp_name;
		this.manager_id = manager_id;
	}
	public Allocation() {
		super();
	}
	

}
