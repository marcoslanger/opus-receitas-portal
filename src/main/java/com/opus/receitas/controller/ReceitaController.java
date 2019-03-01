package com.opus.receitas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.opus.receitas.dto.IngredientesDto;
import com.opus.receitas.dto.ReceitaDto;
import com.opus.receitas.service.ReceitaService;
import com.opus.receitas.utils.Constants;


 
@RestController
public class ReceitaController {
	@Autowired
	ReceitaService receitaService;	

	@GetMapping(Constants.GET_RECEITA_BY_ID)
	public ReceitaDto getReceitaById(@PathVariable Integer id) {
		return receitaService.getReceitaById(id);
	}	
		
	@GetMapping(Constants.GET_ALL_RECEITAS)
	public List<ReceitaDto> getAllReceitas() {
		return receitaService.getAllReceitas();
	}
	
	@PostMapping(value= Constants.SAVE_RECEITA)
	public void saveReceita(@RequestBody ReceitaDto receitaDto) {
		receitaService.saveReceita(receitaDto);
	}
	
	@GetMapping(Constants.GET_ALL_INGREDIENTES)
	public List<IngredientesDto> getAllIngredientes() {
		return receitaService.getAllIngredientes();
	}
	
}
