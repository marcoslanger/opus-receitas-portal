package com.opus.receitas.dto;

public class ReceitaDto {
    private Integer id;
    private String nome;
    private Integer calorias;    
    private String preparo;
    private String ingredientes;

    /**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**
	 * @return the calorias
	 */
	public Integer getCalorias() {
		return calorias;
	}

	/**
	 * @param calorias the calorias to set
	 */
	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}

	/**
	 * @return the preparo
	 */
	public String getPreparo() {
		return preparo;
	}

	/**
	 * @param preparo the preparo to set
	 */
	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}

	/**
	 * @return the ingredientes
	 */
	public String getIngredientes() {
		return ingredientes;
	}

	/**
	 * @param ingredientes the ingredientes to set
	 */
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ReceitaDto(Integer id, String nome, Integer calorias, String preparo, String ingredientes) {
        this.id = id;
        this.nome = nome;
        this.calorias = calorias;
        this.preparo = preparo;
        this.ingredientes = ingredientes;
    }
    
    public ReceitaDto() {
    	
    }

	
	

    
    
}
