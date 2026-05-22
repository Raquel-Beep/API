package org.serratec.raquel.DTO;

import org.serratec.raquel.domain.Organizador;

@Schema(description = "DTO para resposta de organizador")
public class OrganizadorDTOResponse {
    
    @Schema(description = "ID do organizador")
    private Long id;

    @Schema(description = "Nome do organizador")
    private String nome;

    @Schema(description = "Email do organizador")
    private String email;

    public OrganizadorDTOResponse() {
    }

    public OrganizadorDTOResponse(Organizador organizador) {
        this.id = organizador.getId();
        this.nome = organizador.getNome();
        this.email = organizador.getEmail();
    }

    // Getters e Setters
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
