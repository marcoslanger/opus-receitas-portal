package com.opus.receitas.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opus.receitas.converter.IngredientesConverter;
import com.opus.receitas.converter.ReceitaConverter;
import com.opus.receitas.dto.IngredientesDto;
import com.opus.receitas.dto.ReceitaDto;
import com.opus.receitas.repository.IngredientesRepository;
import com.opus.receitas.repository.ReceitaRepository;
import com.opus.receitas.service.ReceitaService;


@Service
public class ReceitaServiceimpl implements ReceitaService {
	@Autowired
	ReceitaRepository receitaRepository;
	@Autowired
	IngredientesRepository ingredientesRepository;

	@Override
	public ReceitaDto getReceitaById(Integer id) {
		return ReceitaConverter.entityToDto(receitaRepository.getOne(id));
	}

	@Override
	public void saveReceita(ReceitaDto receitaDto) {
		receitaRepository.save(ReceitaConverter.dtoToEntity(receitaDto));
	}

	@Override
	public List<ReceitaDto> getAllReceitas() {
		return receitaRepository.findAll().stream().map(ReceitaConverter::entityToDto).collect(Collectors.toList());
	}
	
	@Override
	public List<IngredientesDto> getAllIngredientes() {
		return ingredientesRepository.findAll().stream().map(IngredientesConverter::entityToDto).collect(Collectors.toList());
	}
}
