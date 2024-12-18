package com.springboot.mvc_thymeleaf.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // controller to show initial form
   @GetMapping("/showForm")
    String sayHello() {
        return "HelloWorld-form";

    }

    @GetMapping("/processForm")
    String processForm() {
    return "helloworld";
    }
    
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest req, Model model) {

       // reading request from HTML
        String theName = req.getParameter("studentName");
        // data processing
        theName = theName.toUpperCase();
        // message creation
        String result = "Yo..!!" + theName;
        // adding to the Model
        model.addAttribute("message", result);
        // return the page
        return "helloworld";
    }
    @RequestMapping("/processFormVersionThree")
    public String handleThirdReq(@RequestParam("studentName") String theName, Model model) {

        theName = theName.toUpperCase();
        // message creation
        String result = "Yo from the third response..!!" + theName;
        // adding to the Model
        model.addAttribute("message", result);
        // return the page
        return "helloworld";
    }
}

