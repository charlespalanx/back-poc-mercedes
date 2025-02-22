package com.mercedes.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReglaBean {

    private String idRegla;
    private String idArea;
    private String descripcion;
    
    private ReglaBeanHijo hijo;

}

