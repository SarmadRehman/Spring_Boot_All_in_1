package com.RestProject_SpringBoot_4_1.cruddemo.Dao;

import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
