package org.serratec.raquel.service;

import org.serratec.raquel.DTO.OrganizadorDTORequest;
import org.serratec.raquel.domain.Organizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizadorService {

    @Autowired
    private OrganizadorRepository organizadorRepository;

    public List<OrganizadorDTOResponse> findAll(Long id) {
        Organizador organizador = organizadorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Organizador não encontrado com id: " + id));
                return new OrganizadorDTOResponse(organizador);
    } 

    public OrganizadorDTOResponse insert(OrganizadorDTORequest dto) {
        Organizador existente = organizadorRepository.findByEmail(dto.getEmail());
        if (existente != null) {
            throw new DuplicateEntryException("Email já cadastrado: " + dto.getEmail());
        }
        Organizador organizador = new Organizador(dto.getNome(), dto.getEmail(), dto.getSenha());
        return new OrganizadorDTOResponse(organizadorRepository.save(organizador));
    }  

    public OrganizadorDTOResponse atualizar(Long id, OrganizadorDTORequest dto) {
        Organizador organizador = organizadorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Organizador não encontrado com id: " + id));
        
                organizador.getNome(dto.getNome());
                organizador.getEmail(dto.getEmail());
                organizador.getSenha(dto.getSenha());
        return new OrganizadorDTOResponse(organizadorRepository.save(organizador));

    public void deletar(Long id){
        if (!organizadorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Organizador não encontrado com id: " + id);
        }
        organizadorRepository.deleteById(id);324wq3
    }
    
}
