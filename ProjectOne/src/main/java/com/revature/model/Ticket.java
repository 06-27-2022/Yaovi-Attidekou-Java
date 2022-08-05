package com.revature.model;

import java.util.Objects;

public class Ticket {
    private int amount;
    private String description;
	private String status;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int amount, String description, String status) {
		super();
		this.amount = amount;
		this.description = description;
		this.status = status;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, description, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return amount == other.amount && Objects.equals(description, other.description)
				&& Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "Ticket [amount=" + amount + ", description=" + description + ", status=" + status + "]";
	}
   
    
}
