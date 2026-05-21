package org.serratec.raquel.controller;

import org.serratec.raquel.domain.Participante;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/participante")

    public class ParticipanteController {

        @Autowired
        private ParticipanteService participanteService;

        @GetMapping
        public ResponseEntity<List<ParticipanteDTOResponse>> listarParticipantes() {

            return ResponseEntity.ok(participanteService.findAll());
        }

        @PostMapping
        public ResponseEntity<ParticipanteDTOResponse> inserirParticipante(@Valid @RequestBody  Participante participante) {

             ParticipanteDTOResponse salvo = ParticipanteService.inserir(participante);

            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(participante.getId())
                    .toUri();
                    return ResponseEntity.created(uri).body(Paricipante)
            
    }