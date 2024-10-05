package com.RestProject_SpringBoot_4_1.cruddemo.rest;


import com.RestProject_SpringBoot_4_1.cruddemo.Dao.EmployeeDao;
import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDao employeeDao;

    // quick and dirty : using contructor injection
    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    // expose "/employee" and return a list of employees
    @GetMapping("employees")
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
