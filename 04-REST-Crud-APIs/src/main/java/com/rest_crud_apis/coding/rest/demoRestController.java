package com.rest_crud_apis.coding.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class demoRestController {

    // add code for "/hello" endpoint

    @GetMapping("/hello")
    public String sayHello() {
        return "hello world..!!";
    }
}
