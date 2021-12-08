package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/home")
    public String hello(Model model){
        model.addAttribute("index", "1");
        return "hello";
    }

}
