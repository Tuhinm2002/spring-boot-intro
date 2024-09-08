package com.tuhin.SpringDemoFirst.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String greet(){
        return "Hello world from tuhin";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello from about";
    }
}
