package com.example.demo.casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Habitacion {
    @Autowired
    private Mueble mueble;
    @Autowired
    private Puerta puerta;
    @Autowired
    private Ventana ventana;

    private String color;
    private float medidas;
    private String tipo;

    public Habitacion(Mueble mueble, Puerta puerta, Ventana ventana, String color, float medidas, String tipo) {
        this.mueble = mueble;
        this.puerta = puerta;
        this.ventana = ventana;
        this.color = color;
        this.medidas = medidas;
        this.tipo = tipo;
    }

    @Autowired
    public Habitacion(Mueble mueble, Puerta puerta, Ventana ventana) {
        this.mueble = mueble;
        this.puerta = puerta;
        this.ventana = ventana;
    }

    public Habitacion() {
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Habitacion{" +
                "mueble=" + mueble +
                ", puerta=" + puerta +
                ", ventana=" + ventana +
                ", color='" + color + '\'' +
                ", medidas=" + medidas +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
