package com.example.mongodbconnections;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

    @Autowired
    private EmployeeRepository employeeRepository;


    public String addEmp(Employee employee){

        employeeRepository.save(employee);

        return "Employee has been savedd";

    }

}
