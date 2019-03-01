package com.opus.receitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opus.receitas.entity.Receita;


@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer>{
}
