package org.serratec.raquel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private OrganizadorService organizadorService;

    public List<EventoDTOResponse> findAll() {
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoDTOResponse> listaEventos = new ArrayList<>();
        for (Evento evento : eventos) {
            lista.add(new EventoDTOResponse(evento));
        }
        return listaEventos;
    }

    public EventoDTOResponse findById(Long id) {
        Evento evento = eventoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado com id: " + id));
        return new EventoDTOResponse(evento);
    }

    public EventoDTOResponse inserir(EventoDTORequest dto) {
        Organizador organizador = organizadorRepository.findById(dto.getIdOrganizador())
                .orElseThrow(() -> new ResourceNotFoundException("Organizador não encontrado com id: " + dto.getIdOrganizador()));
            
        CategoriaEvento categoria = categoriaEventoRepository.findById(dto.getIdCategoria())
                .orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada com id: " + dto.getIdCategoria()));

        Evento evento = new Evento(dto.getNomeEvento();
        , dto.getDescricaoEvento(), dto.getLocalEvento(), dto.getDataEvento(), dto.getHoraEvento());
        evento.setOrganizador(organizador);
        evento.setCategoria(categoria);

        return new EventoDTOResponse(eventoRepository.save(evento));
    }

    public EventoDTOResponse atualizar(Long id, EventoDTORequest dto) {
        Evento evento = eventoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado com id: " + id));

        Organizador organizador = organizadorRepository.findById(dto.getIdOrganizador())
                .orElseThrow(() -> new ResourceNotFoundException("Organizador não encontrado com id: " + dto.getIdOrganizador()));
            
        CategoriaEvento categoria = categoriaEventoRepository.findById(dto.getIdCategoria())
                .orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada com id: " + dto.getIdCategoria()));

        evento.setNomeEvento(dto.getNomeEvento());
        evento.setDescricaoEvento(dto.getDescricaoEvento());
        evento.setLocalEvento(dto.getLocalEvento());
        evento.setDataEvento(dto.getDataEvento());
        evento.setHoraEvento(dto.getHoraEvento());
        evento.setOrganizador(organizador);
        evento.setCategoria(categoria);

        return new EventoDTOResponse(eventoRepository.save(evento));
    }

    public void deletar(Long id) {
        if (!eventoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Evento não encontrado com id: " + id);
        }
        eventoRepository.deleteById(id);
    }    
}
