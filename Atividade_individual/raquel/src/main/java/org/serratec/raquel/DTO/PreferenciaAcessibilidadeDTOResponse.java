package org.serratec.raquel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.serratec.raquel.domain.PreferenciaAcessibilidade;

@Schema(description = "Dados da preferência de acessibilidade")
public class PreferenciaAcessibilidadeDTOResponse {

    @Schema(description = "ID da preferência")
    private Long id;
    private String tipoAcessibilidade;
    private boolean libras;
    private boolean audioDescricao;
    private boolean legenda;
    private boolean cadeiraRodas;
    private boolean braile;
    private boolean acompanhante;
    private String observacao;

    @Schema(description = "Nome do participante")
    private String nomeParticipante;

    public PreferenciaAcessibilidadeDTOResponse() {}

    public PreferenciaAcessibilidadeDTOResponse(PreferenciaAcessibilidade p) {
        this.id = p.getId();
        this.tipoAcessibilidade = p.getTipoAcessibilidade();
        this.libras = p.isLibras();
        this.audioDescricao = p.isAudioDescricao();
        this.legenda = p.isLegenda();
        this.cadeiraRodas = p.isCadeiraRodas();
        this.braile = p.isBraile();
        this.acompanhante = p.isAcompanhante();
        this.observacao = p.getObservacao();
        if (p.getParticipante() != null)
            this.nomeParticipante = p.getParticipante().getNome();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipoAcessibilidade() {
        return tipoAcessibilidade;
    }
    public void setTipoAcessibilidade(String tipoAcessibilidade) {
        this.tipoAcessibilidade = tipoAcessibilidade;
    }
    public boolean isLibras() {
        return libras;
    }
    public void setLibras(boolean libras) {
        this.libras = libras;
    }
    public boolean isAudioDescricao() {
        return audioDescricao;
    }
    public void setAudioDescricao(boolean audioDescricao) {
        this.audioDescricao = audioDescricao;
    }
    public boolean isLegenda() {
        return legenda;
    }
    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }
    public boolean isCadeiraRodas() {
        return cadeiraRodas;
    }
    public void setCadeiraRodas(boolean cadeiraRodas) {
        this.cadeiraRodas = cadeiraRodas;
    }
    public boolean isBraile() {
        return braile;
    }
    public void setBraile(boolean braile) {
        this.braile = braile;
    }
    public boolean isAcompanhante() {
        return acompanhante;
    }
    public void setAcompanhante(boolean acompanhante) {
        this.acompanhante = acompanhante;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public String getNomeParticipante() {
        return nomeParticipante;
    }
    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

   
}