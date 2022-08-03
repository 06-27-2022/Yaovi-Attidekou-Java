package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.RevEmployee;
import com.revature.util.ConnectionUtil;

public class RevEmployeeRepositoryImpl implements RevEmployeeRepository {
	/**
	 * @return a list of revEmployee to the caller.
	 * 
	 */
	
	@SuppressWarnings("null")
	public List<RevEmployee> findAllRevEmployee() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		List<RevEmployee> revEmployees = new ArrayList<>();
		
		
		try {
		     conn = ConnectionUtil.getNewConnection(); 
		    
		    stmt = conn.createStatement();
		    
		    final String SQL = "insert into revEmployees values(default,?,?,? )";
			stmt.execute(SQL);
		   
		   while(set.next()) {
			 RevEmployee revEmployee = new RevEmployee(
					 set.getInt(1),
					 set.getString(2),
					 set.getString(3),
					 set.getInt(4));
			 revEmployees.add(revEmployee);
		
		   }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			conn.close();
			stmt.close();
			set.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return revEmployees;
	}


	@Override
	public void save(RevEmployee revEmployee) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		final String SQL = "insert into revEmployees values(default,?,?,? )";
		try {
			
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			
			
			stmt.setInt(1, revEmployee.getRevEmployeeId());
			stmt.setString(2, revEmployee.getRevEmployeeFirstName());
			stmt.setString(3, revEmployee.getRevEmployeeLastName());
			stmt.setInt(4,revEmployee.getManagerId());
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

	@Override
	public void update(RevEmployee revEmployee) {
		//first step: open connection to database.
		Connection conn = null;
		//Statement object to run queries against the database
		PreparedStatement stmt = null;
		final String SQL = "update revEmployees set revEmployee_lastName = ? where id = ?";
		
		try {
			// I am using utility class and method to grab a new connection to the database
			conn= ConnectionUtil.getNewConnection();
			// Now I am using connection to get a Statement object.
			stmt = conn.prepareStatement(SQL);
		    stmt.setString(1, revEmployee.getRevEmployeeLastName()); 
		    stmt.setInt(2,revEmployee.getRevEmployeeId());
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
		


	@Override
	public RevEmployee findById(int revEmployeeId) {
		RevEmployee revEmployee = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet set = null;
		final String SQL = "select * from revEmployees where id = ?";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setInt(1, revEmployeeId);
			set = stmt.executeQuery();
			
			//Now I want extract the data from the record in the ResultSet.
			if(set.next()) {
				revEmployee = new RevEmployee(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getInt(4)
						);
						
			}
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			conn.close();
			stmt.close();
			set.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
			
			
			return revEmployee;
	
}

	@Override
	public List<RevEmployee> findAllRevEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
