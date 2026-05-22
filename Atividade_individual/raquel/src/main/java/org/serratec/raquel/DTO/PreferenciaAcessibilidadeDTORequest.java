package org.serratec.raquel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Schema(description = "Dados para cadastro ou atualização de preferência de acessibilidade")
public class PreferenciaAcessibilidadeDTORequest {

    @Schema(description = "Tipo de acessibilidade")
    private String tipoAcessibilidade;

    @Schema(description = "Necessita de intérprete de Libras")
    private boolean libras;

    @Schema(description = "Necessita de audiodescrição")
    private boolean audioDescricao;

    @Schema(description = "Necessita de legenda")
    private boolean legenda;

    @Schema(description = "Necessita de acesso para cadeira de rodas")
    private boolean cadeiraRodas;

    @Schema(description = "Necessita de material em braile")
    private boolean braile;

    @Schema(description = "Necessita de acompanhante")
    private boolean acompanhante;

    @Schema(description = "Observações adicionais")
    private String observacao;

    @Schema(description = "ID do participante vinculado")
    @NotNull(message = "O ID do participante é obrigatório")
    @Positive(message = "O ID do participante deve ser positivo")
    private Long participanteId;

    // Getters e Setters

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
    public Long getParticipanteId() {
        return participanteId;
    }
    public void setParticipanteId(Long participanteId) {
        this.participanteId = participanteId;
    }
    

}