package com.example.demo.casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {

    @Autowired
    private Marco marco;

    @Autowired
    private Picaporte picaporte;

    private float medidas;

    private String color;


    public Puerta(Marco marco, Picaporte picaporte, float medidas, String color) {
        this.marco = marco;
        this.picaporte = picaporte;
        this.medidas = medidas;
        this.color = color;
    }

    @Autowired
    public Puerta(Marco marco, Picaporte picaporte) {
        this.marco = marco;
        this.picaporte = picaporte;
    }

    public Puerta() {
    }

    public Picaporte getPicaporte() {
        return picaporte;
    }

    public void setPicaporte(Picaporte picaporte) {
        this.picaporte = picaporte;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public float getMedidas() {
        return medidas;
    }

    public void setMedidas(float medidas) {
        this.medidas = medidas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
