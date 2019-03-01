package com.opus.receitas.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Receita implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
    
 	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
    @Column
    private String nome;
    @Column
    private Integer calorias;
    @Column
    private String preparo;
    @Column
    private String ingredientes;

    

    public Receita() {
    }

    public Receita(String nome) {
    	this.nome = nome;
    }

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

	

	

	
    
}
