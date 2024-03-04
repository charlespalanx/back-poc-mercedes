package com.mercedes.demo.model;

public class ReglaBean {

    private String idRegla;
    private String idArea;
    private String descripcion;

    public ReglaBean() {
    }

    public ReglaBean(String idRegla, String idArea, String descripcion) {
        this.idRegla = idRegla;
        this.idArea = idArea;
        this.descripcion = descripcion;
    }

    public String getIdRegla() {
        return idRegla;
    }

    public void setIdRegla(String idRegla) {
        this.idRegla = idRegla;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

