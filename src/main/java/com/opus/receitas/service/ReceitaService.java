package com.opus.receitas.service;

import java.util.List;

import com.opus.receitas.dto.IngredientesDto;
import com.opus.receitas.dto.ReceitaDto;

public interface ReceitaService {
    ReceitaDto getReceitaById(Integer id);
    void saveReceita(ReceitaDto receitaDto);
    List<ReceitaDto> getAllReceitas();
    List<IngredientesDto> getAllIngredientes();
}
