package com.example.demo;

import com.example.demo.Coche;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class ControlCoche {

    @GetMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche() {
        Coche coche = new Coche("Toyota", "Corolla", 2022, "Rojo");
        return ResponseEntity.ok(coche);
    }

    @PostMapping("/coche2")
    public ResponseEntity<Coche> crearCoche(@RequestBody Coche coche) {
        System.out.println(coche);
        return ResponseEntity.ok(coche);
    }
}