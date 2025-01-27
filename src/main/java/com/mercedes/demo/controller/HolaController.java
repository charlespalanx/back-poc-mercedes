package com.mercedes.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaController {
	
    @GetMapping("")
    public String getDemo() {
    	
    	return "Hola Mundo";
    }
    
}
