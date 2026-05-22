package org.serratec.raquel.controller;

import java.net.URI;
import java.util.List;

import org.serratec.raquel.dto.PreferenciaAcessibilidadeDTORequest;
import org.serratec.raquel.dto.PreferenciaAcessibilidadeDTOResponse;
import org.serratec.raquel.service.PreferenciaAcessibilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/preferencias-acessibilidade")
public class PreferenciaacessibilidadeController {

    @Autowired
    private PreferenciaAcessibilidadeService preferenciaService;

    @Operation(summary = "Lista todas as preferências")
    @GetMapping
    public ResponseEntity<List<PreferenciaAcessibilidadeDTOResponse>> listar() {
        return ResponseEntity.ok(preferenciaService.findAll());
    }

    @Operation(summary = "Busca preferência de acessibilidade por ID")
    @GetMapping("/{id}")
    public ResponseEntity<PreferenciaAcessibilidadeDTOResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(preferenciaService.findById(id));
    }

    @Operation(summary = "Cadastra uma nova preferência")
    @PostMapping
    public ResponseEntity<PreferenciaAcessibilidadeDTOResponse> inserir(
            @Valid @RequestBody PreferenciaAcessibilidadeDTORequest dto) {
        PreferenciaAcessibilidadeDTOResponse salvo = preferenciaService.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(salvo.getId()).toUri();
        return ResponseEntity.created(uri).body(salvo);
    }

    @Operation(summary = "Atualiza uma preferência aexistente")
    @PutMapping("/{id}")
    public ResponseEntity<PreferenciaAcessibilidadeDTOResponse> atualizar(@PathVariable Long id,
            @Valid @RequestBody PreferenciaAcessibilidadeDTORequest dto) {
        return ResponseEntity.ok(preferenciaService.atualizar(id, dto));
    }

    @Operation(summary = "Remove uma preferência")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        preferenciaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
