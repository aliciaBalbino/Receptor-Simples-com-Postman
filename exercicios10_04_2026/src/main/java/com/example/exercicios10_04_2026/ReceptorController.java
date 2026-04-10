package com.example.exercicios10_04_2026;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReceptorController {

    @PostMapping("/enviar")

    public String receber (@RequestBody String mensagem){
        return "Middleware confirmou: " +mensagem + "foi recebido com sucesso!";

    }
}
