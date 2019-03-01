package com.opus.receitas.converter;

import com.opus.receitas.dto.ReceitaDto;
import com.opus.receitas.entity.Receita;


public class ReceitaConverter {
	public static Receita dtoToEntity(ReceitaDto receitaDto) {
		Receita receita = new Receita(receitaDto.getNome());
		receita.setId(receitaDto.getId());
		receita.setCalorias(receitaDto.getCalorias());
		receita.setPreparo(receitaDto.getPreparo());
		receita.setIngredientes(receitaDto.getIngredientes());
		return receita;
	}

	public static ReceitaDto entityToDto(Receita receita) {		
		ReceitaDto receitaDto = new ReceitaDto(receita.getId(), receita.getNome(), receita.getCalorias(), receita.getPreparo(), receita.getIngredientes());
		
		return receitaDto;
	}
}
