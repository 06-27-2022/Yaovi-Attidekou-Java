package com.revature.model;

import java.util.Objects;

/**
 * 
 * 
 * @author matti
 * This class models a Revature employee.
 */
public class RevEmployee {
	private int id;
	private String employeeFirstName;
	private String employeeLastName;
	private int managerId;
	
	
	
	

	public RevEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RevEmployee(int id, String employeeFirstName, String employeeLastName, int managerId) {
		super();
		this.id = id;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.managerId = managerId;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeFirstName, employeeLastName, id, managerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RevEmployee other = (RevEmployee) obj;
		return Objects.equals(employeeFirstName, other.employeeFirstName)
				&& Objects.equals(employeeLastName, other.employeeLastName) && id == other.id
				&& managerId == other.managerId;
	}

	@Override
	public String toString() {
		return "RevEmployee [id=" + id + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", managerId=" + managerId + "]";
	}



	public String getRevEmployeeFirstName() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getRevEmployeeLastName() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getRevEmployeeId() {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	

}
