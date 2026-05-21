package org.serratec.raquel.controller;

import org.serratec.raquel.domain.Organizador;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Organizador")

public class OrganizadorController {
    @PostMapping 
    public ResponseEntity<String> criarOrganizador(@Valid @RequestBody Organizador organizador) {
        
        return ResponseEntity
        
            .status(HttpStatus.CREATED)
            .body("Organizador criado com sucesso: " + organizador.getNome());
    }
}
