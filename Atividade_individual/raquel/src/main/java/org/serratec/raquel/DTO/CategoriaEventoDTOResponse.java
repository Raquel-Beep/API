package org.serratec.raquel.dto;

public class CategoriaEventoDTOResponse {
    private Long id;
    private String nomeCategoria;

    public CategoriaEventoDTOResponse() {}

    public CategoriaEventoDTOResponse(Long id, String nomeCategoria) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeCategoria() { return nomeCategoria; }
    public void setNomeCategoria(String nomeCategoria) { this.nomeCategoria = nomeCategoria; }
}
