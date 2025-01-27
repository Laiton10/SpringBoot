package com.example.demo.casa;

import org.springframework.stereotype.Component;

@Component
public class Marco {
    private String tipoMadera;

    public Marco(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public Marco() {

    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }
}
