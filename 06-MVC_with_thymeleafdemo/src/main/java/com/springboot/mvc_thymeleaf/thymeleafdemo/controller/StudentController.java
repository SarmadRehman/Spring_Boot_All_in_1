package com.springboot.mvc_thymeleaf.thymeleafdemo.controller;


import com.springboot.mvc_thymeleaf.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping
    public String showForm(Model model) {

        Student theStudent = new Student();

        model.addAttribute("student", theStudent);
        return "student-form";
    }
}
