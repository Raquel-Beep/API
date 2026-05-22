package org.serratec.raquel.controller;

import java.net.URI;

import org.serratec.raquel.dto.EventoDTORequest;
import org.serratec.raquel.dto.EventoDTOResponse;
import org.serratec.raquel.domain.Evento;
import org.serratec.raquel.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @Operation(summary = "Listar todos os eventos")
    @GetMapping
    public ResponseEntity<List<EventoDTOResponse>> listarEventos() {
        return ResponseEntity.ok(eventoService.findAll());
    }

    @Operation(summary = "Obter um evento por ID")
    @GetMapping("/{id}")
    public ResponseEntity<EventoDTOResponse> obterEventoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(eventoService.findById(id));
    }

    @Operation(summary = "Criar um novo evento")
    @PostMapping
    public ResponseEntity<EventoDTOResponse> inserir(@Valid @RequestBody EventoDTORequest dto) {
        EventoDTOResponse salvo = eventoService.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(salvo.getId()).toUri();
        return ResponseEntity.created(uri).body(salvo);
    }

    @Operation(summary = "Atualizar um evento existente")
    @PutMapping("/{id}")
    public ResponseEntity<EventoDTOResponse> atualizar(@PathVariable Long id, @Valid @RequestBody EventoDTORequest dto) {
        return ResponseEntity.ok(eventoService.atualizar(id, dto));
    }

    @Operation(summary = "Excluir um evento")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        eventoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
    
}
