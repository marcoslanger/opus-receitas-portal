package com.opus.receitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opus.receitas.entity.Ingredientes;


@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Integer>{
}
