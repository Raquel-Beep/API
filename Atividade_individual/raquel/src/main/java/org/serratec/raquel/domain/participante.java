package org.serratec.raquel.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    private String senha;

    @OneToOne(mappedBy = "participante")
    private PreferenciaAcessibilidade preferenciaAcessibilidade;

    @ManyToMany(mappedBy = "participantes")
    private List<Evento> eventos;

    public Participante() {}

    public Participante(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public PreferenciaAcessibilidade getPreferenciaAcessibilidade() { return preferenciaAcessibilidade; }
    public void setPreferenciaAcessibilidade(PreferenciaAcessibilidade p) { this.preferenciaAcessibilidade = p; }

    public List<Evento> getEventos() { return eventos; }
    public void setEventos(List<Evento> eventos) { this.eventos = eventos; }
}