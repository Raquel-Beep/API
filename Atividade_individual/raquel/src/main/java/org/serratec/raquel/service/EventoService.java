package org.serratec.raquel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import org.serratec.raquel.dto.EventoDTORequest;
import org.serratec.raquel.dto.EventoDTOResponse;
import org.serratec.raquel.exception.ResourceNotFoundException;
import org.serratec.raquel.domain.Evento;
import org.serratec.raquel.domain.CategoriaEvento;
import org.serratec.raquel.domain.Organizador;
import org.serratec.raquel.repository.CategoriaEventoRepository;
import org.serratec.raquel.repository.EventoRepository;
import org.serratec.raquel.repository.OrganizadorRepository;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private CategoriaEventoRepository categoriaEventoRepository;

    @Autowired
    private OrganizadorRepository organizadorRepository;

    public List<EventoDTOResponse> findAll() {
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoDTOResponse> listaEventos = new ArrayList<>();

        for (Evento evento : eventos) {
            listaEventos.add(new EventoDTOResponse(evento));
        }

        return listaEventos;
    }

    public EventoDTOResponse findById(Long id) {

        Evento evento = eventoRepository.findById(id)
            .orElseThrow(() ->
                new ResourceNotFoundException("Evento não encontrado com id: " + id));

        return new EventoDTOResponse(evento);
    }

    public EventoDTOResponse inserir(EventoDTORequest dto) {

        Organizador organizador = organizadorRepository.findById(dto.getIdOrganizador())
            .orElseThrow(() ->
                new ResourceNotFoundException("Organizador não encontrado"));

        CategoriaEvento categoria = categoriaEventoRepository.findById(dto.getIdCategoria())
            .orElseThrow(() ->
                new ResourceNotFoundException("Categoria não encontrada"));

        Evento evento = new Evento(
            dto.getNomeEvento(),
            dto.getDescricaoEvento(),
            dto.getLocalEvento(),
            dto.getDataEvento(),
            dto.getHoraEvento()
        );

        evento.setOrganizador(organizador);
        evento.setCategoria(categoria);

        return new EventoDTOResponse(eventoRepository.save(evento));
    }
}