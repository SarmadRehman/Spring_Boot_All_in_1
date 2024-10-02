package com.rest_crud_apis.coding.rest;

import com.rest_crud_apis.coding.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> theStudents;

        //define @PostConstruct to load the student data ..... only once  (when created)
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Sarmad", "Rehman"));
        theStudents.add(new Student("wijdan", "haider"));
        theStudents.add(new Student("daniyal", "niazi"));
        theStudents.add(new Student("Choi", "Ahmad"));
    }


    //define endpoint "/students"
    @GetMapping("/students")
    public List<Student> getStudents () {
        return theStudents;
    }
}
