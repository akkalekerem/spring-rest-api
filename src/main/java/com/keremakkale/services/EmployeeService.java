package com.keremakkale.services;

import com.keremakkale.model.Employee;
import com.keremakkale.model.UpdateEmployeeRequest;
import com.keremakkale.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {
        //employeeRepository.getAllEmployeeList();
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }

    public Employee saveEmployee(Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String id){
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(String id, UpdateEmployeeRequest updatedEmployee){
        return employeeRepository.updateEmployee(id, updatedEmployee);
    }
}
