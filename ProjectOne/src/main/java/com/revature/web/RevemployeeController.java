package com.revature.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Revemployee;
import com.revature.repository.RevemployeeRepository;
import com.revature.repository.RevemployeeRepositoryImpl;

public class RevemployeeController {
    private static RevemployeeRepository revemployeeRepository;
    
    public RevemployeeController() {
    	revemployeeRepository = new RevemployeeRepositoryImpl();
    	
    	
    }
    
    public static List<Revemployee> findAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	return revemployeeRepository.findAllRevEmployees();
    	
    }
    
    public static void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String jsonBody = new String(request.getInputStream().readAllBytes());
    	ObjectMapper objectMapper = new ObjectMapper();
    	Revemployee newRevemployee = objectMapper.readValue(jsonBody, Revemployee.class);
    	revemployeeRepository.save(newRevemployee);
    	
    }
}
