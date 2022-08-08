package org.gen.lojagames.repository;

import java.util.List;

import org.gen.lojagames.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	public List<CategoriaModel> findByNomeCategoriaContainingIgnoreCase(String categoria);
}
