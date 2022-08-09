package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class DispatcherServlet  extends HttpServlet{
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6762949098059492676L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		
		String httpVerb = request.getMethod();
		
		if(httpVerb.equals("GET")) {
			RequestHelper.processGet(request, response);
			
		}else if(httpVerb.equals("POST")) {
			RequestHelper.processPost(request, response);
			
		}
		
	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doGet(request, response);
	}
	 
	}
