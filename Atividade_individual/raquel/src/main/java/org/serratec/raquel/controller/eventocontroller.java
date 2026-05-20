package org.serratec.raquel.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/eventocontroller")
public class eventocontroller {

    @PostMapping
    public ResponseEntity<String> criarEvento(@Valid @RequestBody Evento evento)
    
    {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("Evento criado com sucesso: " + evento.getNomeEvento());
    }
    
}
