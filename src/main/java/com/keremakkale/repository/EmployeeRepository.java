package com.keremakkale.repository;

import com.keremakkale.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import com.keremakkale.services.EmployeeService;
@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById(String id) {
        Employee findEmployee = null;
        for (Employee employee : employeeList) {
            if (id.equals(employee.getId())) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
        List<Employee> filteredEmployees = new ArrayList<>();

        if (firstName == null && lastName == null) {
            return employeeList;
        }
        for (Employee employee : employeeList) {
            if (firstName.equals(employee.getFirstName()) && lastName.equals(employee.getLastName())) {
                filteredEmployees.add(employee);
            }

        }
        return filteredEmployees;
    }

    public Employee saveEmployee(Employee newEmployee){
        employeeList.add(newEmployee);
        return newEmployee;
    }

    public boolean deleteEmployee(String id) {
        Employee employeeToDelete = getEmployeeById(id);
        if (employeeToDelete != null) {
            employeeList.remove(employeeToDelete);
            return true;
        }
        return false;
    }
}

