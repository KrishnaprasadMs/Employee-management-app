package project;

import java.util.Objects;

public class User {
	
	private int emp_id;
	private String emp_name;
	private String user_name; 
	private String password;
	
	private String gender;
	private String bonus;
	private String basic_salary;
	private String emp_status;
	private String position;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(String basic_salary) {
		this.basic_salary = basic_salary;
	}
	public String getEmp_status() {
		return emp_status;
	}
	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(basic_salary, bonus, emp_id, emp_name, emp_status, gender, password, position, user_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(basic_salary, other.basic_salary) && Objects.equals(bonus, other.bonus)
				&& emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name)
				&& Objects.equals(emp_status, other.emp_status) && Objects.equals(gender, other.gender)
				&& Objects.equals(password, other.password) && Objects.equals(position, other.position)
				&& Objects.equals(user_name, other.user_name);
	}
	
	@Override
	public String toString() {
		return "User [emp_id=" + emp_id + ", emp_name=" + emp_name + ", user_name=" + user_name + ", password="
				+ password + ", position=" + position + ", gender=" + gender + ", bonus=" + bonus + ", basic_salary="
				+ basic_salary + ", emp_status=" + emp_status + ", getEmp_id()=" + getEmp_id() + ", getEmp_name()="
				+ getEmp_name() + ", getUser_name()=" + getUser_name() + ", getPassword()=" + getPassword()
				+ ", getPosition()=" + getPosition() + ", getGender()=" + getGender() + ", getBonus()=" + getBonus()
				+ ", getBasic_salary()=" + getBasic_salary() + ", getEmp_status()=" + getEmp_status() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	public User() {
		super();
	}
	public User(int emp_id, String emp_name, String user_name, String password,  String gender,
			String bonus, String basic_salary, String emp_status,String position) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.user_name = user_name;
		this.password = password;
		this.position = position;
		this.gender = gender;
		this.bonus = bonus;
		this.basic_salary = basic_salary;
		this.emp_status = emp_status;
	}
	

	
	

}
