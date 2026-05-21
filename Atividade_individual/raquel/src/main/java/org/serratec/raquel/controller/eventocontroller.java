package org.serratec.raquel.controller;

import org.serratec.raquel.domain.Evento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @PostMapping
    public ResponseEntity<String> criarEvento(@Valid @RequestBody Evento evento) {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("Evento criado com sucesso: " + evento.getNomeEvento());
    }
    
}
