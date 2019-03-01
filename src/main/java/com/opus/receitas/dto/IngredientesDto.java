package com.opus.receitas.dto;



public class IngredientesDto {
    Integer ingredienteId;
    String nome;

    public IngredientesDto(Integer ingredienteId, String nome) {
        this.ingredienteId = ingredienteId;
        this.nome = nome;
    }
    
    public IngredientesDto(Integer ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    public IngredientesDto() {
    }

	/**
	 * @return the ingredienteId
	 */
	public Integer getIngredienteId() {
		return ingredienteId;
	}

	/**
	 * @param ingredienteId the ingredienteId to set
	 */
	public void setIngredienteId(Integer ingredienteId) {
		this.ingredienteId = ingredienteId;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

    
   
}
