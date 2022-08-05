package com.revature.model;

import java.util.Objects;

public class Ticket {
    private int amount;
    private String description;
	
    public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int amount, String description) {
		super();
		this.amount = amount;
		this.description = description;
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

	@Override
	public int hashCode() {
		return Objects.hash(amount, description);
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
		return amount == other.amount && Objects.equals(description, other.description);
	}

	@Override
	public String toString() {
		return "Ticket [amount=" + amount + ", description=" + description + "]";
	}
	
    
    
}
