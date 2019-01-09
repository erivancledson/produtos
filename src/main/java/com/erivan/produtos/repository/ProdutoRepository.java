package com.erivan.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erivan.produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);
}
