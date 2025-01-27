package com.mercedes.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercedes.demo.model.ReglaBean;
import com.mercedes.demo.model.ReglaBeanHijo;



@RestController
@RequestMapping("/api/demo")
public class DemoController {
	
    @GetMapping("")
    public List<ReglaBean> getDemo() {
    	
    	ReglaBeanHijo regla = ReglaBeanHijo.builder().idArea("1").idRegla("1").build();
    	
    	List<ReglaBean> listaReglas = new ArrayList<>();
    	listaReglas.add(new ReglaBean("1", "10", "Esta es una regla", regla));
    	listaReglas.add(new ReglaBean("2", "20", "Esta es otra regla", new ReglaBeanHijo()));
    	
    	ReglaBean prueba = new ReglaBean();
    	prueba.setDescripcion("Descripcion");
    	prueba.setIdArea("1");
    	
    	prueba.getDescripcion();
    	
        return listaReglas;
    }
    
    @PostMapping("")
    public ReglaBean getPost(@RequestBody ReglaBean entrada) {
    	
    	entrada.setDescripcion(entrada.getDescripcion().concat("_PRUEBA"));
    	entrada.setIdArea(entrada.getIdArea().concat("_PRUEBA"));
    	entrada.setIdRegla(entrada.getIdRegla().concat("_PRUEBA"));
    	
        return entrada;
    }
    
}
