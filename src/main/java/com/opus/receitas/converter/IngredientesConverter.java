package com.opus.receitas.converter;

import com.opus.receitas.dto.IngredientesDto;
import com.opus.receitas.entity.Ingredientes;


public class IngredientesConverter {
	public static Ingredientes dtoToEntity(IngredientesDto IngredienteDto) {
		Ingredientes ingredientes = new Ingredientes(IngredienteDto.getNome());
		ingredientes.setIngredienteId(IngredienteDto.getIngredienteId());
		return ingredientes;
	}

	public static IngredientesDto entityToDto(Ingredientes ingredientes) {
		return new IngredientesDto(ingredientes.getIngredienteId(), ingredientes.getNome());
	}
}
