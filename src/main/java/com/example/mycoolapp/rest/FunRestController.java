package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that returb "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
//    Add expose new endpoint after add devtool for auto reload updated code
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
}
