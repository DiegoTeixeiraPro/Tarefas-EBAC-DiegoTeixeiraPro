package com.diego.dao;

import com.diego.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;

    public Produto consultar(String codigo) throws Exception;

    public List<Produto> consultarTodos() throws Exception;

    public Integer atualizar(Produto produto) throws Exception;

    public Integer excluir(Produto ProdutoBD) throws Exception;
}