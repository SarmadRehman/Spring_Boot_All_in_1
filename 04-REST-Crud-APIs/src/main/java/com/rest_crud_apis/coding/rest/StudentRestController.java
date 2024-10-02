package com.rest_crud_apis.coding.rest;

import com.rest_crud_apis.coding.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //define endpoint "/students"

    @GetMapping("/students")
    public List<Student> getStudents () {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Sarmad", "Rehman"));
        theStudents.add(new Student("wijda", "haider"));
        theStudents.add(new Student("daniyal", "niazi"));
        theStudents.add(new Student("Choi", "Ahmad"));
        return theStudents;
    }
}
