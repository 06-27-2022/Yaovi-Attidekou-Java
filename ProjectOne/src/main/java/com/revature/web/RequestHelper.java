package com.revature.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class RequestHelper {
	private static RevemployeeController revemployeeController = new RevemployeeController();
	public static Object processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String resource = request.getRequestURI();
		System.out.println(resource);
		
		
		String isolatedResource= resource.replace("/ProjectOne/api", "");
		System.out.println(isolatedResource);
		
		
		
		switch(isolatedResource) {
		case "/employees":
			
			response.setContentType("application/json");
		    return revemployeeController.findAll(request, response);
			
			
			
		default:
			response.setStatus(404);
			break;
		
		}
		return null;
	}
	public static void processPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String resource = request.getRequestURI().replace("/ProjectOne/api", "");
		
		switch(resource) {
		case "/employee":
			RevemployeeController.save(request, response);
			break;
		default:
			response.setStatus(404);
			break;
		}
	}
}


