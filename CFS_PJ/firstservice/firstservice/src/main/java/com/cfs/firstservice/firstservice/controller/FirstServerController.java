package com.cfs.firstservice.firstservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstServerController {


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the First service.";
    }
}
