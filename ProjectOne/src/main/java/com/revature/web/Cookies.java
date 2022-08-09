package com.revature.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

import com.revature.model.Revemployee;

public class Cookies extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -584985904574226172L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		List<Revemployee> employeesList = revemployeeRepository.findAllRevEmployees();
		Revemployee loggedInEmployee = null;

		for (int i = 0; i < employeesList.size(); i++) {
			if (employeesList.get(i).getUserName().equals(username)
					&& employeesList.get(i).getPassword().equals(password)) {
				loggedInEmployee = employeesList.get(i);
				Cookie emplCookie = new Cookie("authenticated", "true");
				response.addCookie(emplCookie);
				response.setStatus(201);
				break;
			} else {
				response.setStatus(401);
			}
		}
	}
}