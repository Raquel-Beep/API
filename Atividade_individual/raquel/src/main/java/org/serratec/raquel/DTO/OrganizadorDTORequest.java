package org.serratec.raquel.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

@Schema(description = "DTO para cadastro/atualização de organizador")
public class OrganizadorDTORequest {
    
    @Schema(description = "Nome do organizador")
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Schema(description = "Email do organizador")
    @NotBlank(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @Schema(description = "Senha do organizador")
    @NotNull(message = "A senha é obrigatória")
    private String senha;

    // Getters e Setters

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
