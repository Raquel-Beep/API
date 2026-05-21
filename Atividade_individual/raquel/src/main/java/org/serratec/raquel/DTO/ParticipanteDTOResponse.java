package org.serratec.raquel.dto;

import org.serratec.raquel.domain.Participante;

public class ParticipanteDTOResponse {

    private Long id;
    private String nome;
    private String email;

    public ParticipanteDTOResponse() {
        super();
    }

    public ParticipanteDTOResponse( Participante participante) {
        this.id = participante.getId();
        this.nome = participante.getNome();
        this.email = participante.getEmail();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
