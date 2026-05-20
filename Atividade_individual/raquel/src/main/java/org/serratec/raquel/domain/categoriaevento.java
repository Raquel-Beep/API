package org.serratec.raquel.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria_evento")
public class CategoriaEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<Evento> eventos;

    public CategoriaEvento() {}

    public CategoriaEvento(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeCategoria() { return nomeCategoria; }
    public void setNomeCategoria(String nomeCategoria) { this.nomeCategoria = nomeCategoria; }

    public List<Evento> getEventos() { return eventos; }
    public void setEventos(List<Evento> eventos) { this.eventos = eventos; }
}