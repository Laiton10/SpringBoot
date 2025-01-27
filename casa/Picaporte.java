package com.example.demo.casa;

import org.springframework.stereotype.Component;

@Component
public class Picaporte {

    private String tipo;

    public Picaporte(String tipo) {
        this.tipo = tipo;
    }

    public Picaporte() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

