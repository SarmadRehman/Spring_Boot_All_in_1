package com.RestProject_SpringBoot_4_1.cruddemo.service;

import com.RestProject_SpringBoot_4_1.cruddemo.Dao.EmployeeDao;
import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
