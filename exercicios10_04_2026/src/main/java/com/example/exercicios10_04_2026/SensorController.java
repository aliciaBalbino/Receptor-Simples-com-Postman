package com.example.exercicios10_04_2026;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {

    @PostMapping("/sensor")
    public String capturarTemperatura(@RequestBody double temperatura) {

        if (temperatura > 30) {

            return "Alerta de sistema: temperatura" + temperatura + "C° acima do limite!";
        }
        return "Dados do sensor registrado: " + temperatura + "C°";

    }
}