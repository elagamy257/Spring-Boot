package com.elagamy.MyApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestCon {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
