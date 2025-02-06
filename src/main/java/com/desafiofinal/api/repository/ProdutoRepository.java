package com.desafiofinal.api.repository;

import com.desafiofinal.api.model.Produto;
import com.desafiofinal.api.service.ProdutoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT p FROM Produto p WHERE p.preco = ?1")
    List<Produto> buscarPorPreco(Double preco);
}



