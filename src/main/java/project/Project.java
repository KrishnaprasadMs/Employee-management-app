package project;

import java.util.Objects;

public class Project {

	private int project_id;
	private String project_name;
	private String startdate;
	private String enddate;
	private int no_of_resources_required;
	private int no_of_resources_allocated;
	private String project_status;
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
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public int getNo_of_resources_required() {
		return no_of_resources_required;
	}
	public void setNo_of_resources_required(int no_of_resources_required) {
		this.no_of_resources_required = no_of_resources_required;
	}
	public int getNo_of_resources_allocated() {
		return no_of_resources_allocated;
	}
	public void setNo_of_resources_allocated(int no_of_resources_allocated) {
		this.no_of_resources_allocated = no_of_resources_allocated;
	}
	public String getProject_status() {
		return project_status;
	}
	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(enddate, no_of_resources_allocated, no_of_resources_required, project_id, project_name,
				project_status, startdate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(enddate, other.enddate) && no_of_resources_allocated == other.no_of_resources_allocated
				&& no_of_resources_required == other.no_of_resources_required && project_id == other.project_id
				&& Objects.equals(project_name, other.project_name)
				&& Objects.equals(project_status, other.project_status) && Objects.equals(startdate, other.startdate);
	}
	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", no_of_resources_required=" + no_of_resources_required
				+ ", no_of_resources_allocated=" + no_of_resources_allocated + ", project_status=" + project_status
				+ ", getProject_id()=" + getProject_id() + ", getProject_name()=" + getProject_name()
				+ ", getStartdate()=" + getStartdate() + ", getEnddate()=" + getEnddate()
				+ ", getNo_of_resources_required()=" + getNo_of_resources_required()
				+ ", getNo_of_resources_allocated()=" + getNo_of_resources_allocated() + ", getProject_status()="
				+ getProject_status() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	public Project(int project_id, String project_name, String startdate, String enddate, int no_of_resources_required,
			int no_of_resources_allocated, String project_status) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.startdate = startdate;
		this.enddate = enddate;
		this.no_of_resources_required = no_of_resources_required;
		this.no_of_resources_allocated = no_of_resources_allocated;
		this.project_status = project_status;
	}
	public Project() {
		super();
	}
	

	/*CREATE TABLE "project" (
			"project_id"	INTEGER NOT NULL,
			"project_name"	TEXT NOT NULL,
			"startdate"	TEXT NOT NULL,
			"enddate"	TEXT NOT NULL,
			"no_of_resources_required"	INTEGER NOT NULL,
			"no_of_resources_allocated"	INTEGER,
			"project_status"	TEXT,
			PRIMARY KEY("project_id" AUTOINCREMENT)
		)*/
	
}
