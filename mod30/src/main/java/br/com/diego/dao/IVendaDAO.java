package br.com.diego.dao;

import br.com.diego.dao.generic.IGenericDAO;
import br.com.diego.domain.Venda;
import br.com.diego.exceptions.DAOException;
import br.com.diego.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}