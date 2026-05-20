package org.serratec.raquel.participante;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Participante {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    private String senha;

    public Participante() {}

    public Participante(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }


    public String getNome()  { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    public void setNome(String nome)   { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
}