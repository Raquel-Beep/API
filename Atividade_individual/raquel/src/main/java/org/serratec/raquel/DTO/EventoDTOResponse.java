package org.serratec.raquel.dto;

@Schema(description = "Resposta do evento")
public class EventoDTOResponse {

    @Schema(description = "Id do evento")
    private Long idEvento;

    @Schema(description = "Nome do evento")
    private String nomeEvento;

    @Schema(description = "Descrição do evento")
    private String descricaoEvento;

    @Schema(description = "Local do evento")
    private String localEvento;

    @Schema(description = "Data do evento")
    private LocalDate dataEvento;

    @Schema(description = "Hora do evento")
    private LocalTime hora;

    @Schema(description = "Id do organizador")
    private String idOrganizador;

    @Schema(description = "Id da categoria")
    private Long idCategoria;

    public EventoDTOResponse() {
    }

    public EventoDTOResponse(Evento evento) {
        this.idEvento = evento.getIdEvento();
        this.nomeEvento = evento.getNomeEvento();
        this.descricaoEvento = evento.getDescricaoEvento();
        this.localEvento = evento.getLocalEvento();
        this.dataEvento = evento.getDataEvento();
        this.hora = evento.getHora();
        this.idOrganizador = evento.getIdOrganizador();
        this.idCategoria = evento.getIdCategoria();
    }

    // Getters e Setters

    public Long getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }
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
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
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
