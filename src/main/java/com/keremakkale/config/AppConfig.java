package com.keremakkale.config;
import com.keremakkale.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;
import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Enes", "Bayram"));
        employeeList.add(new Employee("2","Yakup","Reçber"));
        employeeList.add(new Employee("3","Ahmet","Bulut"));
        employeeList.add(new Employee("4","Serkan", "Uzun"));
        employeeList.add(new Employee("5","Hilal","Kısa"));

        return employeeList;
    }
}
