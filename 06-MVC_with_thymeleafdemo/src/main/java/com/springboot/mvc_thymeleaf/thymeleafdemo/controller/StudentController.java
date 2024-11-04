package com.springboot.mvc_thymeleaf.thymeleafdemo.controller;


import com.springboot.mvc_thymeleaf.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    // for getting from the html page
    @GetMapping("/showStudentForm")
    public String showForm(Model model) {

        Student theStudent = new Student();

        model.addAttribute("student", theStudent);
        return "student-form";
    }

    // for Posting to the html page
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log the input data

        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
