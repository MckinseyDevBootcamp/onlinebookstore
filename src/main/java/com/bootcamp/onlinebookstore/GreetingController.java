package com.bootcamp.onlinebookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello, World!";
    }
}
