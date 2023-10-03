package com.example.SpringBootDemoProject;


import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, world";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Your name is "+ name;

    }

    @GetMapping("/details")
    public String details(@RequestParam String name,
                          @RequestParam int age){
        return name + "has just turned" + age;
    }




}