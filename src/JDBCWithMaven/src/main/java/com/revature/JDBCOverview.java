package com.revature;

//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.List;

import com.revature.model.RevEmployee;
import com.revature.repository.RevEmployeeRepository;
import com.revature.repository.RevEmployeeRepositoryImpl;
//import com.revature.util.ConnectionUtil;

/*DriverManager
 *Connection 
 *Statement
 *ResultSet
 *SQLException
 */

public class JDBCOverview {
	public static void main(String[] args){
	  RevEmployeeRepository  revEmployeeRepository = new RevEmployeeRepositoryImpl();
	  RevEmployee newRevEmployee = new RevEmployee(5,"Stephanie" ,"Bowser" ,3);
	  revEmployeeRepository.save(newRevEmployee);
	  List<RevEmployee> revEmployees = revEmployeeRepository.findAllRevEmployees();
	  //System.out.println(revEmployees);
	 // for(RevEmployee individual: revEmployees) {
		 // System.out.println(individual);
	  //}
	  
	 // RevEmployee revEmployeeToUpdate = new RevEmployee(1,"Yaovi","Agbe",4);
	 // revEmployeeRepository.update(revEmployeeToUpdate);
	  
	  //for(RevEmployee individual: revEmployees) {
		  //System.out.println(individual);
	  //}
	  
	  RevEmployee retrievedRevEmployee = revEmployeeRepository.findById(3);
	  System.out.println(retrievedRevEmployee);
}
}
