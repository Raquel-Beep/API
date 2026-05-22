package org.serratec.raquel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;

@Schema(description = "Dados/ Atualização do participante")
public class ParticipanteDTORequest {

    @Schema(description = "Nome do participante")
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Schema(description = "Email do participante")
    @NotBlank(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @Schema(description = "Senha do participante")
    @NotBlank(message = "A senha é obrigatória")
    private String senha;

    public ParticipanteDTORequest() {
        super();
    }

    // Getters and Setters
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
    public String getSenha() {
        return senha;
    }   
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
