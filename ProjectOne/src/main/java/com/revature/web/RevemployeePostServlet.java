package com.revature.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;



/**
 * Servlet implementation class ProcessTicketsPost
 */
@WebServlet("/RevemployeePost")
public class RevemployeePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RevemployeePostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String requestBodyText = new String( request.getInputStream().readAllBytes());
		 /*
		  * After retrieving the request body and converting into String, I want to deserialize it into a Java Object
		  * using Jackson's Object Mapper
		  */
		 
		 ObjectMapper objectMapper = new ObjectMapper();
		Revemployee clientRevemployee = objectMapper.readValue(requestBodyText, Revemployee.class);
		
		/*
		 * Our ultimate goal is to persist the revemployee data in my DB.
		 */
		 
		 RevemployeeRepository revemployeeRepository = new RevemployeeRepositoryImpl();
		 revemployeeRepository.save(clientRevemployee);
		 
		 
		 
		 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
