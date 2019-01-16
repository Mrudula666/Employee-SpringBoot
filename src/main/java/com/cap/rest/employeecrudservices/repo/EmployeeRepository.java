package com.cap.rest.employeecrudservices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cap.rest.employeecrudservices.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Object>{

}
