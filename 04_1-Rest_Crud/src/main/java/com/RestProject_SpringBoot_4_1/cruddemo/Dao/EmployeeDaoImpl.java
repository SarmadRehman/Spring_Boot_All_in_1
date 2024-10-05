package com.RestProject_SpringBoot_4_1.cruddemo.Dao;

import com.RestProject_SpringBoot_4_1.cruddemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    // define field entityManager
    private EntityManager entityManager;

    // setting constructor injection

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> FindAll() {

        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee ", Employee.class);
        //execute the query and get the result list
        List<Employee> employees = theQuery.getResultList();
        // return the  results

        return employees;

    }
}
