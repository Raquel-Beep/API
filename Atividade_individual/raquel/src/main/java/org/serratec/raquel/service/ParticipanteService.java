package org.serratec.raquel.service;

import java.util.ArrayList;

import org.serratec.raquel.domain.Participante;
import org.serratec.raquel.dto.ParticipanteDTOResponse;
import org.serratec.raquel.exception.EmailException;
import org.serratec.raquel.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class ParticipanteService {
    
    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<ParticipanteDTOResponse> findAll() {
        List<Participante> participantes = participanteRepository.findAll();
        List<ParticipanteDTOResponse> participantesDTO = new ArrayList<>();
        for (Participante participante : participantes) {
            participantesDTO.add(new ParticipanteDTOResponse(participante));
        }
        return participantesDTO;
    }

    public List<ParticipanteDTOResponse>findAll() {
        List<Participante> participante = participanteRepository.findAll(id)
        .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado com id: " + id));
        return new ParticipanteDTOResponse(participante);
        }

     public ParticipanteDTOResponse inserir(ParticipanteDTORequest dto) {
        Participante existente = participanteRepository.findByEmail(dto.getEmail());
        if (existente != null) {
            throw new EmailException("Email já cadastrado: " + dto.getEmail());
        }
        Participante participante = new Participante(dto.getNome(), dto.getEmail(), dto.getSenha());
        Participante salvo = participanteRepository.save(participante);
        return new ParticipanteDTOResponse(salvo);
        }

        for (Participante participante : participantes){
            ParticipanteDTOResponse dto = new ParticipanteDTOResponse(participante);
            participantesDTO.add(dto);
            }

            return participantesDTO;
        }

    public ParticipanteDTOResponse findById(Long id) {
        Participante participante = participanteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado com id: " + id));
        return new ParticipanteDTOResponse(participante);
    }
        
    public ParticipanteDTOResponse inserir(Participante participante) {
        Participante participanteExistente = participanteRepository.findByEmail(participante.getEmail());
        if (participanteExistente != null) {
            throw new EmailException("Email já cadastrado: ");
        }
        Participante participante = new Participante(dto.getNome(), dto.getEmail(), dto.getSenha());
        Participante salvo = participanteRepository.save(participante);
        return new ParticipanteDTOResponse(salvo);
         }

    
        public ParticipanteDTOResponse atualizar(Long id, ParticipanteDTORequest dto) {
        Participante participante = participanteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado com id: " + id));
        participante.setNome(dto.getNome());
        participante.setEmail(dto.getEmail());
        participante.setSenha(dto.getSenha());
        Participante atualizado = participanteRepository.save(participante);
        return new ParticipanteDTOResponse(atualizado);
    }

    public void deletar(Long id) {
        if (!participanteRepository.existsById(id)) {
            throw new ResourceNotFoundException("Participante não encontrado com id: " + id);
        }
        participanteRepository.deleteById(id);
    }
}
