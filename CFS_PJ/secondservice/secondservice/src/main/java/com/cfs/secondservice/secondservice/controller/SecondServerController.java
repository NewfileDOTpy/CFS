package com.cfs.secondservice.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class SecondServerController {


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the Second service.";
    }
}
