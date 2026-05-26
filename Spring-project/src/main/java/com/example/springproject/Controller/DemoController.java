package com.example.springproject.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/hello")
    public String func1(){
        return "You just visited /api/hello";
    }

    @GetMapping("/end")
    public String func2(){
        return "You just visited /api/end";
    }
}
