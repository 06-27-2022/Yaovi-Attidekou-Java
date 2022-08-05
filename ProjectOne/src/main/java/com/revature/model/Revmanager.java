package com.revature.model;

import java.util.Objects;

public class Revmanager {
	private int id;
	private String firstName;
	private String lastName;
	private String location;
	private String emailId;
	
	public Revmanager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Revmanager(int id, String firstName, String lastName, String location, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailId, firstName, id, lastName, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revmanager other = (Revmanager) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "Revmanager [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location
				+ ", emailId=" + emailId + "]";
	}
	
	
	

}
