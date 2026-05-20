package org.serratec.raquel.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEvento;
    private String descricao;
    private String local;
    private LocalDate data;
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Organizador organizador;

    @ManyToMany
    @JoinTable(
        name = "evento_participante",
        joinColumns = @JoinColumn(name = "evento_id"),
        inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private List<Participante> participantes;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEvento categoria;

    public Evento() {}

    public Evento(String nomeEvento, String descricao, String local, LocalDate data, LocalTime hora) {
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
        this.hora = hora;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeEvento() { return nomeEvento; }
    public void setNomeEvento(String nomeEvento) { this.nomeEvento = nomeEvento; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    public Organizador getOrganizador() { return organizador; }
    public void setOrganizador(Organizador organizador) { this.organizador = organizador; }

    public List<Participante> getParticipantes() { return participantes; }
    public void setParticipantes(List<Participante> participantes) { this.participantes = participantes; }

    public CategoriaEvento getCategoria() { return categoria; }
    public void setCategoria(CategoriaEvento categoria) { this.categoria = categoria; }
}