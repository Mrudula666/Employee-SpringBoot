package com.cap.rest.employeecrudservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.rest.employeecrudservices.entity.Employee;
import com.cap.rest.employeecrudservices.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public void addNewEmployee(Employee employee) {
				repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	@Override
	public void update(Employee employee) {
	repository.save(employee);
		
	}

	@Override
	public void delete(int empId) {
		repository.deleteById(empId);
		
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return repository.findById(empId).get();
	}

}
