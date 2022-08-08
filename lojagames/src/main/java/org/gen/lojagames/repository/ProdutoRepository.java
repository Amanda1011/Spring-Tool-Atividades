package org.gen.lojagames.repository;

import java.util.List;

import org.gen.lojagames.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	List<ProdutoModel>findByNome(String nome);



}
