package com.revature.controller;
import java.util.*;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;


//@RestController
public class UserController {
	
	  private RevemployeeRepository revemployeeRepository;
	  public ObjectMapper objectMapper;
	  
	  public UserController() {
		  revemployeeRepository = new RevemployeeRepositoryImpl();
		  objectMapper = new ObjectMapper();
	  }
	  
	  public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			String json = objectMapper.writeValueAsString(revemployeeRepository.findAllRevEmployees());
			return json;
		}
		
		public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			//Check the request body for JSON
			String jsonBody = new String(request.getInputStream().readAllBytes());
			Revemployee newRevemployee = objectMapper.readValue(jsonBody, Revemployee.class);
			revemployeeRepository.save(newRevemployee);
		}

}

//List<User> Users = new ArrayList<User>();
//User CurrentUser = null;
//
//public UserController() {
//    this.CurrentUser = null;
//}
//
//@GetMapping("/getcurrentuser")
//public User getUser() {
//    return CurrentUser;
//}
//
//@GetMapping("/getusers")
//public List<User> getUsers() {
//
//    return Users;
//}

//@PostMapping("/createuser")
//public String CreateUser(@RequestBody Login Login) {
//    User NewUser;
//
//    //check if the username already exited
//    for (int i = 0; i < Users.size(); i++) {
//        if (Users.get(i).getUsername().toLowerCase()
//                .equals(Login.Username.toLowerCase())) return "Username taken";
//    }
//
//
//    NewUser = new User(Login.Username, Login.Password);
//
//    Users.add(NewUser);
//    return "New user created successfully";
//}
//@PostMapping("/login")
//public String Login(@RequestBody Login Login) {
//
//    for (int i = 0; i < Users.size(); i++) {
//        if (Users.get(i).getUsername().toLowerCase().equals(Login.Username.toLowerCase())
//                && Users.get(i).getPassword().equals(Login.Password) ) {
//            CurrentUser = Users.get(i);
//            return "You are now login";
//        }
//    }
//
//    CurrentUser = null;
//
//    return "Incorrect Username and Password";
//}
//
//@DeleteMapping("/logout")
//public String Logout() {
//    if (CurrentUser == null) return "You are not login";
//    CurrentUser = null;
//    return "You are logged out successfully";
//}
