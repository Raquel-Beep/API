package org.serratec.raquel.controller;

import org.serratec.raquel.domain.Organizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Organizador")
public class OrganizadorController {

    @Autowired
    private OrganizadorService organizadorService;

    @Operation(summary = "Lista dos organizadores")
    @GetMapping
    public ResponseEntity.ok(organizadorService.findAll());
    }

    @Operation(summary = "Busca de um organizador por id")
    @GetMapping("/{id}")
    public ResponseEntity<OrganizadorDTOResponse> buscarOrganizador(@PathVariable Long id) {
        return ResponseEntity.ok(organizadorService.findAll(id));
    }

    @Operation(summary = "Criação de um organizador")
    @PostMapping 
    public ResponseEntity<OrganizadorDTOResponse> insert(@Valid @RequestBody OrganizadorDTORequest dto) {
        OrganizadorDTOResponse salvo = organizadorService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
            .path("/{id}").buildAndExpand(salvo.getId()).toUri();
        return ResponseEntity.created(uri).body(salvo);
    }

    @Operation(summary = "Atualização de um organizador")
    @PutMapping("/{id}")
    public ResponseEntity<OrganizadorDTOResponse> atualizar(@PathVariable Long id, @Valid @RequestBody OrganizadorDTORequest dto) {
        return ResponseEntity.ok(organizadorService.atualizar(id, dto));
    }

    @Operation(summary = "Removendo um organizador")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        organizadorService.deletar(id);
        return ResponseEntity.noContent().build();
    }