package com.cap.rest.employeecrudservices.service;

import java.util.List;

import com.cap.rest.employeecrudservices.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void update(Employee employee);

	void delete(int empId);

	Employee getEmployee(int empId);

	
	

}