package org.serratec.raquel.controller;

import org.serratec.raquel.domain.CategoriaEvento;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria-evento")
    public class CategoriaEventoController {

        @PostMapping
        public ResponseEntity<String> criarCategoriaEvento(@Valid @RequestBody CategoriaEvento categoriaEvento) {
            
            return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Categoria de evento criada com sucesso: " + categoriaEvento.getNomeCategoria());
        }
        
        
    }
