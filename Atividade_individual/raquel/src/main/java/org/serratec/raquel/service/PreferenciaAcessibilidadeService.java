package org.serratec.raquel.service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.raquel.domain.Participante;
import org.serratec.raquel.domain.PreferenciaAcessibilidade;
import org.serratec.raquel.dto.PreferenciaAcessibilidadeDTORequest;
import org.serratec.raquel.dto.PreferenciaAcessibilidadeDTOResponse;
import org.serratec.raquel.exception.ResourceNotFoundException;
import org.serratec.raquel.repository.ParticipanteRepository;
import org.serratec.raquel.repository.PreferenciaAcessibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferenciaAcessibilidadeService {

    @Autowired
    private PreferenciaAcessibilidadeRepository preferenciaRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<PreferenciaAcessibilidadeDTOResponse> findAll() {
        List<PreferenciaAcessibilidade> lista = preferenciaRepository.findAll();
        List<PreferenciaAcessibilidadeDTOResponse> resultado = new ArrayList<>();
        for (PreferenciaAcessibilidade p : lista) {
            resultado.add(new PreferenciaAcessibilidadeDTOResponse(p));
        }
        return resultado;
    }

    public PreferenciaAcessibilidadeDTOResponse findById(Long id) {
        PreferenciaAcessibilidade preferencia = preferenciaRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Preferência não encontrada com id: " + id));
        return new PreferenciaAcessibilidadeDTOResponse(preferencia);
    }

    public PreferenciaAcessibilidadeDTOResponse inserir(PreferenciaAcessibilidadeDTORequest dto) {
        Participante participante = participanteRepository.findById(dto.getParticipanteId())
            .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado com id: " + dto.getParticipanteId()));

        PreferenciaAcessibilidade preferencia = new PreferenciaAcessibilidade();
        preferencia.setTipoAcessibilidade(dto.getTipoAcessibilidade());
        preferencia.setLibras(dto.isLibras());
        preferencia.setAudioDescricao(dto.isAudioDescricao());
        preferencia.setLegenda(dto.isLegenda());
        preferencia.setCadeiraRodas(dto.isCadeiraRodas());
        preferencia.setBraile(dto.isBraile());
        preferencia.setAcompanhante(dto.isAcompanhante());
        preferencia.setObservacao(dto.getObservacao());
        preferencia.setParticipante(participante);

        return new PreferenciaAcessibilidadeDTOResponse(preferenciaRepository.save(preferencia));
    }

    public PreferenciaAcessibilidadeDTOResponse atualizar(Long id, PreferenciaAcessibilidadeDTORequest dto) {
        PreferenciaAcessibilidade preferencia = preferenciaRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Preferência não encontrada com id: " + id));

        Participante participante = participanteRepository.findById(dto.getParticipanteId())
            .orElseThrow(() -> new ResourceNotFoundException("Participante não encontrado com id: " + dto.getParticipanteId()));

        preferencia.setTipoAcessibilidade(dto.getTipoAcessibilidade());
        preferencia.setLibras(dto.isLibras());
        preferencia.setAudioDescricao(dto.isAudioDescricao());
        preferencia.setLegenda(dto.isLegenda());
        preferencia.setCadeiraRodas(dto.isCadeiraRodas());
        preferencia.setBraile(dto.isBraile());
        preferencia.setAcompanhante(dto.isAcompanhante());
        preferencia.setObservacao(dto.getObservacao());
        preferencia.setParticipante(participante);

        return new PreferenciaAcessibilidadeDTOResponse(preferenciaRepository.save(preferencia));
    }

    public void deletar(Long id) {
        if (!preferenciaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Preferência não encontrada com id: " + id);
        }
        preferenciaRepository.deleteById(id);
    }
}