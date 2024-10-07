package com.RestProject_SpringBoot_4_1.cruddemo.Dao;

import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
