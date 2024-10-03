package com.rest_crud_apis.coding.rest;

import com.rest_crud_apis.coding.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // just index into the list

        // check studentId in the list size
        if((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id \s" + studentId + "\s not found") ;
        }
        return theStudents.get(studentId);
    }


    // adding an exception handler using @ExceptionHandler


}
