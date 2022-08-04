package com.revature.model;

import java.util.Objects;

public class Revemployee {
    private int revemployeeId;
    private String firstName;
    private String lastName;
    private int managerId;
    private String userName;
    private String password;
	
    
    public Revemployee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Revemployee(int revemployeeId, String firstName, String lastName, int managerId, String userName, String password) {
		super();
		this.revemployeeId = revemployeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.managerId = managerId;
		this.userName = userName;
		this.password = password;
	}


	public int getId() {
		return revemployeeId;
	}


	public void setId(int revemployeeId) {
		this.revemployeeId = revemployeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		return Objects.hash(revemployeeId, firstName, lastName, managerId, password, userName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revemployee other = (Revemployee) obj;
		return revemployeeId == other.revemployeeId && Objects.equals(firstName, other.firstName)&& Objects.equals(lastName, other.lastName)
				&& managerId == other.managerId && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName);
	}


	@Override
	public String toString() {
		return "Revemployee [revemployeeId=" + revemployeeId + ", firstName=" + firstName + ", lastname=" + lastName + ", managerId="
				+ managerId + ", userName=" + userName + ", password=" + password + "]";
	}
    
    
    
}
