package com.cap.rest.employeecrudservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.rest.employeecrudservices.entity.Employee;
import com.cap.rest.employeecrudservices.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		
		return service.getEmployee(empId);
		
	}

	@PostMapping
	public void createNewEmployee(@RequestBody Employee employee) {
		
		service.addNewEmployee(employee);
	}

	@PutMapping
	public void update(@RequestBody Employee employee) {
		service.update(employee);
	}

	@DeleteMapping("{empId}")
	public void delete(@PathVariable int empId) {
		service.delete(empId);
	}

}
