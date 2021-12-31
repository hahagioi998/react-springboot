package com.rishi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.springboot.model.Employee;
import com.rishi.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	//get all employees 
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll(); 
	}
	
	
	
}
