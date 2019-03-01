package com.opus.receitas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ingredientes {
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer ingredienteId;
    @Column
    private String nome;

    public Ingredientes() {
    	
    }

    public Ingredientes(String nome) {
    	this.nome = nome;
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
