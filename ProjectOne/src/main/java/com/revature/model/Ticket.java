package com.revature.model;

import java.util.Objects;

public class Ticket {
	private  int ticketId;
	private String status;
    private int amount;
    private int revemployeeId;
    private String description;
	
    public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, String status, int amount, int revemployeeId, String description) {
		super();
		this.ticketId = ticketId;
		this.status = status;
		this.amount = amount;
		this.revemployeeId = revemployeeId;
		this.description = description;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRevemployeeId() {
		return revemployeeId;
	}

	public void setRevemployeeId(int revemployeeId) {
		this.revemployeeId = revemployeeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, description, revemployeeId, status, ticketId);
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
				&& revemployeeId == other.revemployeeId && Objects.equals(status, other.status)
				&& ticketId == other.ticketId;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", status=" + status + ", amount=" + amount + ", revemployeeId="
				+ revemployeeId + ", description=" + description + "]";
	}
	
    
    
    
}