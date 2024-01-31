package com.example.mongodbconnections;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {


    Employee findByDesignation(String designation);
}
