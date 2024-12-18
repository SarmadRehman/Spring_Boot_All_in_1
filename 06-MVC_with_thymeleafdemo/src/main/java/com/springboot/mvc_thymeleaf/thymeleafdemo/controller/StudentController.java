package com.springboot.mvc_thymeleaf.thymeleafdemo.controller;


import com.springboot.mvc_thymeleaf.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;



    // for getting from the html page
    @GetMapping("/showStudentForm")
    public String showForm(Model model) {

        Student theStudent = new Student();

        // add student object to the model
        model.addAttribute("student", theStudent);

        //add list of countries added to the model
        model.addAttribute("countries", countries);

        //add list of languages
        model.addAttribute("languages", languages);

        // add list of systems
        model.addAttribute("systems", systems);

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
