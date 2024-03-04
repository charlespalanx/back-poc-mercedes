package com.mercedes.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercedes.demo.model.ReglaBean;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
 
    @GetMapping("")
    public List<ReglaBean> getDemo() {
    	
    	List<ReglaBean> listaReglas = new ArrayList<>();
    	listaReglas.add(new ReglaBean("1", "10", "Esta es una regla"));
    	listaReglas.add(new ReglaBean("2", "20", "Esta es otra regla"));
        return listaReglas;
    }
    
}
