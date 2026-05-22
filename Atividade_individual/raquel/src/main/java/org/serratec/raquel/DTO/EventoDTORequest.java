package org.serratec.raquel.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "Dados/Atualização de um evento")
public class EventoDTORequest {

    @Schema(description = "Nome do evento")
    @NotBlank(message = "O nome do evento é obrigatório")
    private String nomeEvento;

    @Schema(description = "Descrição do evento")
    @NotBlank(message = "A descrição do evento é obrigatória")
    private String descricaoEvento;

    @Schema(description = "Local do evento")
    @NotBlank(message = "O local do evento é obrigatório")
    private String localEvento;

    @Schema(description = "Data do evento")
    @NotNull(message = "A data do evento é obrigatória")
    private LocalDate dataEvento;

    @Schema(description = "Hora do evento")
    @NotNull(message = "A hora é obrigatória")
    private LocalTime horaEvento;

    @Schema(description = "Id do organizador")
    @NotBlank(message = "O id do organizador é obrigatório")
    private String idOrganizador;

    @Schema(description = "Id da categoria")
    @NotNull(message = "O id da categoria é obrigatório")
    private Long idCategoria;

    // Getters e Setters

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public LocalTime getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(LocalTime horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(String idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
}