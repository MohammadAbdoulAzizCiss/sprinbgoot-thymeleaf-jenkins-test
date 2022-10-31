package com.example.simplemicroservice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    String getHome(Model model){
        return "home";
    }

}
