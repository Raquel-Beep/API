package org.serratec.raquel.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "preferencia_acessibilidade")
public class PreferenciaAcessibilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoAcessibilidade;
    private boolean libras;
    private boolean audioDescricao;
    private boolean legenda;
    private boolean cadeiraRodas;
    private boolean braile;
    private boolean acompanhante;
    private String observacao;

    public PreferenciaAcessibilidade() {
}

    
    @JsonManagedReference("preferencia-participante")
    @OneToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;

   

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipoAcessibilidade() { return tipoAcessibilidade; }
    public void setTipoAcessibilidade(String tipoAcessibilidade) { this.tipoAcessibilidade = tipoAcessibilidade; }

    public boolean isLibras() { return libras; }
    public void setLibras(boolean libras) { this.libras = libras; }

    public boolean isAudioDescricao() { return audioDescricao; }
    public void setAudioDescricao(boolean audioDescricao) { this.audioDescricao = audioDescricao; }

    public boolean isLegenda() { return legenda; }
    public void setLegenda(boolean legenda) { this.legenda = legenda; }

    public boolean isCadeiraRodas() { return cadeiraRodas; }
    public void setCadeiraRodas(boolean cadeiraRodas) { this.cadeiraRodas = cadeiraRodas; }

    public boolean isBraile() { return braile; }
    public void setBraile(boolean braile) { this.braile = braile; }

    public boolean isAcompanhante() { return acompanhante; }
    public void setAcompanhante(boolean acompanhante) { this.acompanhante = acompanhante; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public Participante getParticipante() { return participante; }
    public void setParticipante(Participante participante) { this.participante = participante; }
}