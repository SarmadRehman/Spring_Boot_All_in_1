package com.RestProject_SpringBoot_4_1.cruddemo.rest;



import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import com.RestProject_SpringBoot_4_1.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // quick and dirty : using contructor injection
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // expose "/employee" and return a list of employees
    @GetMapping("employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // mapping for a single Emp for GET /employee/{employeeId}
    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {
        Employee theEmp = employeeService.findById(employeeId);
        if (theEmp == null) {
            throw new RuntimeException("Employee not found \s" + employeeId);
        }
    return theEmp;
    }

}
