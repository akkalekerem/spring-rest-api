package com.keremakkale.controller;

import com.keremakkale.model.Employee;
import com.keremakkale.model.UpdateEmployeeRequest;
import com.keremakkale.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee") // Hepsinin ortak kökü
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList(){
        //employeeService.getAllEmployeeList();
        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName") String firstName,
                                                @RequestParam(name = "lastName") String lastName){
       return employeeService.getEmployeeWithParams(firstName, lastName);
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){  //Yeni kişi eklemek için.

        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id", required = true) String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name = "id", required = true) String id,
                                   @RequestBody UpdateEmployeeRequest updatedEmployee) {

        return employeeService.updateEmployee(id, updatedEmployee);
    }
}
