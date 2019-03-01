package com.opus.receitas;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opus.receitas.entity.Ingredientes;
import com.opus.receitas.repository.IngredientesRepository;

@SpringBootApplication
public class OpusReceitasApplication {
	
	@Autowired
	IngredientesRepository ingredientesRepository;

	public static void main(String[] args) {
		SpringApplication.run(OpusReceitasApplication.class, args);
	}
	
	@PostConstruct
	public void setupDbWithData(){
		Ingredientes ingrediente = new Ingredientes("Sal");	
		ingrediente = ingredientesRepository.save(ingrediente);

		ingrediente = new Ingredientes("Açucar");	
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Farinha de Trigo");	
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Ovos");	
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Pimenta do Reino");	
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Leite");
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Carne de Boi");
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Frango");
		ingrediente = ingredientesRepository.save(ingrediente);
		
		ingrediente = new Ingredientes("Bacon");
		ingrediente = ingredientesRepository.save(ingrediente);
	}

	
}
