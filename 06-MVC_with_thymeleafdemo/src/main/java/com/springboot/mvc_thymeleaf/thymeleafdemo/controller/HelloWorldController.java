package com.springboot.mvc_thymeleaf.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
