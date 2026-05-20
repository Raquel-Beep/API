package org.serratec.raquel.participantecontroller;

import org.model.Participante;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/participante")

    public class participanteController {

        @PostMapping
        public ResponseEntity<String> criarParticipante(@Valid @RequestBody Participante participante) {
            
            return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Participante criado com sucesso: " + participante.getNome());
        }
    }