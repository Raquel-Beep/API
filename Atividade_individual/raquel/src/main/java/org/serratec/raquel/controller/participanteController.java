package org.serratec.raquel.controller;

import org.serratec.raquel.domain.Participante;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/participantes")

    public class ParticipanteController {

        @Autowired
        private ParticipanteService participanteService;

        @operation(summary = "Listar todos os participantes")
        @GetMapping
            public ResponseEntity<List<ParticipanteDTOResponse>> listarParticipantes() {

                return ResponseEntity.ok(participanteService.findAll());
            }

        @operation(summary = "Buscar participante por ID")
        @GetMapping("/{id}")
            public ResponseEntity<ParticipanteDTOResponse> buscarParticipantePorId(@PathVariable Long id) {
                return ResponseEntity.ok(participanteService.findById(id));
            }
        
        @operation(summary = "Cadastrar um novo participante")
        @PostMapping
            public ResponseEntity<ParticipanteDTOResponse> inserir(@valid @requestBody ParticipanteDTORequest dto) {
                ParticipanteDTOResponse salvo = participanteService.inserir(dto);
                URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(salvo.getId())
                        .toUri();
                return ResponseEntity.created(uri).body(salvo);
            }

        @operation(summary = "Atualizar um participante existente")
        @PutMapping("/{id}")
            public ResponseEntity<ParticipanteDTOResponse> atualizar(@PathVariable Long id, @Valid @RequestBody ParticipanteDTORequest dto) {
                return ResponseEntity.ok(participanteService.atualizar(id, dto));
            }

            @operation(summary = "Remover um participante")
            @DeleteMapping("/{id}")
                public ResponseEntity<Void> remover(@PathVariable Long id) {
                    participanteService.remover(id);
                    return ResponseEntity.noContent().build();
                }

    }