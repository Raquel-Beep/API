package org.serratec.raquel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoriaeventocontroller")
    public class categoriaeventocontroller {

        @PostMapping
        public ResponseEntity<String> criarCategoriaEvento(@Valid @RequestBody CategoriaEvento categoriaEvento) {
            
            return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Categoria de evento criada com sucesso: " + categoriaEvento.getNomeCategoria());
        }
        
        
    }
