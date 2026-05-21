package org.serratec.raquel.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.v3.oas.annotations.servers.Server;

@Server(description = "API para gerenciamento de participantes")
public class ParticipanteService {
    
    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> getAllParticipantes() {
        return ParticipanteRepository.findAll();
    }
    public Participante inserir(Participante participante) {
        Participante participanteExistente = ParticipanteRepository.findByEmail(participante.getEmail());
        if (participanteExistente != null) {
            throw new EmailException("Email já cadastrado: ");

            return ParticipanteRepository.save(participante);
        }
    
}
