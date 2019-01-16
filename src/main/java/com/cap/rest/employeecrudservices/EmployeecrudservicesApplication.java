package com.cap.rest.employeecrudservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cap.rest.employeecrudservices.entity.Address;
import com.cap.rest.employeecrudservices.entity.Employee;
import com.cap.rest.employeecrudservices.repo.EmployeeRepository;

@SpringBootApplication
public class EmployeecrudservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeecrudservicesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository) {
		return (arg)-> {
			repository.save(new Employee(101,"Bhargavi",new Address(12,"Sai Ram Colony","Anakapalli","Andhra Pradesh",432516)));
			repository.save(new Employee(102,"Pavani",new Address(14,"Housing Board Colony","Mangalagiri","Andhra Pradesh",65433)));
			repository.save(new Employee(103,"Mrudula",new Address(19,"Rkc New Colony","Macherla","Andhra Pradesh",522426)));
			repository.save(new Employee(104,"Vineela",new Address(16,"Hindu College of Pharmacy","Guntur","Andhra Pradesh",522408)));
		};
	}
	

}

