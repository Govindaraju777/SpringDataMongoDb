package com.itbrothers.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itbrothers.domain.Employee;



public interface EmployeeRepo extends MongoRepository<Employee, Long>{

	 
	
}
