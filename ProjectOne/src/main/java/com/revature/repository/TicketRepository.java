package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Revemployee;
import com.revature.model.Ticket;
import com.revature.util.ConnectionUtil;

public class TicketRepository {
	public List<Ticket> findAllTickets() {

		/*
		 * I've moved my Connection declaration up so that it will be in scope for both
		 * the "try" and "finally" blocks.
		 */
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		// Declaring the list and initializing the List we will return at the end of
		// this method.
		List<Ticket> tickets = new ArrayList<>();

		// Declare my SQL query string ahead of time:
		final String SQL = "select * from ticket";

		try {
			// The first step is to get a connection.
			conn = ConnectionUtil.getNewConnection();

			/*
			 * After we have established a connection, we can execute SQL statements against
			 * our DB. We will need the Statement interface. We can use our connection to
			 * create a statement.
			 */
			stmt = conn.createStatement();

			/*
			 * The ResultSet will store the results of a running a query (e.g. the records
			 * that are returned after executing that query).
			 */
			set = stmt.executeQuery(SQL);

			/*
			 * You have to extra the results from a ResultSet one by one once you have the
			 * records local to your application.
			 */

			while (set.next()) {
				/*
				 * While there is another record in the result set, let's print the the contents
				 * of the table rows here.
				 */
				Ticket ticket = new Ticket(set.getInt(1), set.getString(2),set.getInt(3),set.getInt(4),set.getString(5));
				

				/*
				 * Let's add Associate objects to our List<Associate> (list of associates) on
				 * each iteration.
				 */

				tickets.add(ticket);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/*
			 * Remember that a finally always executes. This makes it a good place to close
			 * your connection to your DB. Yes, you can have a try-catch block inside of a
			 * try-catch block.
			 */
			try {
				conn.close();
				stmt.close();
				set.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return tickets;
	}

	public void save(Ticket ticket) {
		/*
		 * The standard JDBC workflow includes a Connection. We will also want a
		 * Statement so that we can execute it against our DB. We don't necessarily need
		 * a ResultSet if we're not planning on getting records back.
		 */

		Connection conn = null;
		/*
		 * If you're ever going to be inserting user input into a DB, you should use a
		 * special kind of Statement called a PreparedStatement. A PreparedStatement
		 * protects against SQL injection by precompiling a SQL query with placeholders
		 * and then later substituting in the necessary values.
		 */
		PreparedStatement stmt = null;
		/*
		 * We will alter our SQL String to a parameterized SQL String (the question
		 * marks being parameters).
		 */
		final String SQL = "insert into ticket values(default, ?, ?, ?, ?)";

		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			/*
			 * Before you execute a PreparedStatement, you need to specify what the values
			 * of each parameter( each ?) should be.
			 */
			stmt.setString(1, ticket.getStatus());
			stmt.setInt(2, ticket.getAmount());
			stmt.setInt(3, ticket.getRevemployeeId());
			stmt.setString(4, ticket.getDescription());
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void update(Ticket ticket) {
		//The first step should always be to open a Connection to your DB.
		Connection conn = null;
		//I also know that I need a Statement object if I want to run queries against the DB.
		PreparedStatement stmt = null;
		final String SQL = "update ticket set status = ? where ticketid = ?";
		
		try {
			//Using our utility class and method to grab a new connection to the DB
			conn = ConnectionUtil.getNewConnection();
			//Using the connection to get a Statement object.
			stmt = conn.prepareStatement(SQL);
			//Setting the parameters in our parameterized query
			stmt.setString(1, ticket.getStatus());
			stmt.setInt(2, ticket.getTicketId());
			//Executing the query
			stmt.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			conn.close();
			stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
