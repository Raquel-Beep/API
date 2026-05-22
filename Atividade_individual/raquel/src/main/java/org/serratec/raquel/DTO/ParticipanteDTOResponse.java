package org.serratec.raquel.dto;

import org.serratec.raquel.domain.Participante;

import jakarta.validation.constraints.NotBlank;

@Schema(description = "Dados do participante")
public class ParticipanteDTOResponse {

    @Schema(description = "ID do participante")
    private Long id;
    @Schema(description = "Nome do participante")
    private String nome;
    @Schema(description = "Email do participante")
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
