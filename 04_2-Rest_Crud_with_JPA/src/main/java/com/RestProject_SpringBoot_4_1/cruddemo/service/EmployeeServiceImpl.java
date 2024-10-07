package com.RestProject_SpringBoot_4_1.cruddemo.service;

import com.RestProject_SpringBoot_4_1.cruddemo.Dao.EmployeeRepository;
import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;
        if (result.isPresent()) {
            employee = result.get();
        }
        else {
            // did'nt find the employee
            throw new RuntimeException("Employee not found Employee \s" + id);
        }
        return employee;


    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
    employeeRepository.deleteById(id);
    }
}
