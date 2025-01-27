package com.example.demo.casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController {

    @Autowired
    private Casa casa;

    @GetMapping("/casa")
    public ResponseEntity<Casa> obtenerCasa() {
        casa.setColor("Blanco");
        casa.setTipo("Chalet");
        casa.setMetrosCuadrados(200.5);

        Habitacion habitacion = casa.getHabitacion();
        habitacion.setTipo("Dormitorio");
        habitacion.setMedidas(15);
        habitacion.setColor("Azul");

        Puerta puerta = habitacion.getPuerta();
        puerta.setColor("Marrón");
        puerta.setMedidas(2);

        Picaporte picaporte = puerta.getPicaporte();
        picaporte.setTipo("Manilla");

        Marco marco = puerta.getMarco();
        marco.setTipoMadera("Sauce");

        Ventana ventana = habitacion.getVentana();
        ventana.setTipo("Corredera");
        ventana.setMedidas(40);

        Mueble mueble = habitacion.getMueble();
        mueble.setDescripcion("Silla de metal");
        mueble.setTipo("Silla");

        System.out.println(casa.toString());
        return ResponseEntity.ok(casa);
    }
}

