package org.serratec.raquel.controller;

import java.net.URI;
import java.util.List;
import org.serratec.raquel.dto.CategoriaEventoDTORequest;
import org.serratec.raquel.dto.CategoriaEventoDTOResponse;
import org.serratec.raquel.service.CategoriaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/categorias-evento")
public class CategoriaEventoController {

    @Autowired
    private CategoriaEventoService categoriaEventoService;

    @Operation(summary = "Lista categorias de evento")
    @GetMapping
    public ResponseEntity<List<CategoriaEventoDTOResponse>> listar() {
        return ResponseEntity.ok(categoriaEventoService.findAll());
    }

    @Operation(summary = "Busca categorias do evento")
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaEventoDTOResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(categoriaEventoService.findById(id));
    }

    @Operation(summary = "Adiciona nova categoria de evento")
    @PostMapping
    public ResponseEntity<CategoriaEventoDTOResponse> inserir(@Valid @RequestBody CategoriaEventoDTORequest dto) {
        CategoriaEventoDTOResponse salvo = categoriaEventoService.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(salvo.getId()).toUri();
        return ResponseEntity.created(uri).body(salvo);
    }

    @Operation(summary = "Atualiza uma categoria de evento existente")
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaEventoDTOResponse> atualizar(@PathVariable Long id,
            @Valid @RequestBody CategoriaEventoDTORequest dto) {
        return ResponseEntity.ok(categoriaEventoService.atualizar(id, dto));
    }

    @Operation(summary = "Remove uma categoria de evento")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        categoriaEventoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}