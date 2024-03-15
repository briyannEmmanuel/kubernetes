package com.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test")
    public String getData(){
        return "je suis sur la toile ";
    }
}
