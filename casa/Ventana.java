package com.example.demo.casa;

import org.springframework.stereotype.Component;

@Component
public class Ventana {

    private float medidas;
    private String tipo;

    public Ventana(float medidas, String tipo) {
        this.medidas = medidas;
        this.tipo = tipo;
    }

    public Ventana() {
    }

    public float getMedidas() {
        return medidas;
    }

    public void setMedidas(float medidas) {
        this.medidas = medidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
