package com.RestProject_SpringBoot_4_1.cruddemo.rest;

import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import com.RestProject_SpringBoot_4_1.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public Employee addEmpl(@RequestBody Employee emp) {
        // also that in case they pass an id in JSON , set id to 0
        //this is just to force to save a new item , instead of update
        emp.setId(0);

        Employee dbEmp = employeeService.save(emp);

        return dbEmp;
    }

    @PutMapping("employees")
    public Employee updateEmpl(@RequestBody Employee emp) {
        Employee dbEmp = employeeService.save(emp);
        return dbEmp;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmpl(@PathVariable int employeeId) {
        Employee theEmp =  employeeService.findById(employeeId);
        // throw exception if null
        if (theEmp == null) {
            throw new RuntimeException("Employee id not found \s" + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee \s" + employeeId;
    }
}
