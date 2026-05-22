package org.serratec.raquel.service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.raquel.domain.CategoriaEvento;
import org.serratec.raquel.dto.CategoriaEventoDTORequest;
import org.serratec.raquel.dto.CategoriaEventoDTOResponse;
import org.serratec.raquel.exception.ResourceNotFoundException;
import org.serratec.raquel.repository.CategoriaEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaEventoService {

    @Autowired
    private CategoriaEventoRepository categoriaEventoRepository;

    public List<CategoriaEventoDTOResponse> findAll() {
        List<CategoriaEvento> categorias = categoriaEventoRepository.findAll();
        List<CategoriaEventoDTOResponse> lista = new ArrayList<>();
        for (CategoriaEvento c : categorias) {
            lista.add(new CategoriaEventoDTOResponse(c));
        }
        return lista;
    }

    public CategoriaEventoDTOResponse findById(Long id) {
        CategoriaEvento categoria = categoriaEventoRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada com id: " + id));
        return new CategoriaEventoDTOResponse(categoria);
    }

    public CategoriaEventoDTOResponse inserir(CategoriaEventoDTORequest dto) {
        CategoriaEvento categoria = new CategoriaEvento(dto.getNomeCategoria());
        return new CategoriaEventoDTOResponse(categoriaEventoRepository.save(categoria));
    }

    public CategoriaEventoDTOResponse atualizar(Long id, CategoriaEventoDTORequest dto) {
        CategoriaEvento categoria = categoriaEventoRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada com id: " + id));
        categoria.setNomeCategoria(dto.getNomeCategoria());
        return new CategoriaEventoDTOResponse(categoriaEventoRepository.save(categoria));
    }

    public void deletar(Long id) {
        if (!categoriaEventoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Categoria não encontrada com id: " + id);
        }
        categoriaEventoRepository.deleteById(id);
    }
}