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

    public List<ParticipanteDTOResponse>findAll() {
        List<Participante> participantes = participanteRepository.findAll();
        List<ParticipanteDTOResponse> participantesDTO = new ArrayList<>();

        for (Participante participante : participantes){
            ParticipanteDTOResponse dto = new ParticipanteDTOResponse(participante);
            participantesDTO.add(dto);
            }

            return participantesDTO;
        }
    public ParticipanteDTOResponse inserir(Participante participante) {
        Participante participanteExistente = participanteRepository.findByEmail(participante.getEmail());
        if (participanteExistente != null) {
            throw new EmailException("Email já cadastrado: ");
        }
    
        Participante salvo = participanteRepository.save(participante);
        return new ParticipanteDTOResponse(salvo);
}
