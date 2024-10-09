package com.RestProject_SpringBoot_4_1.cruddemo.service;

import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();


    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}