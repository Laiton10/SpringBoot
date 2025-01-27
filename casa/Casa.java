package com.example.demo.casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {
    @Autowired
    private Habitacion habitacion;
    private String tipo;
    private String color;
    private double metrosCuadrados;

    public Casa(Habitacion habitacion, String tipo, String color, double metrosCuadrados) {
        this.habitacion = habitacion;
        this.tipo = tipo;
        this.color = color;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Autowired
    public Casa(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Casa() {
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitacion=" + habitacion +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
