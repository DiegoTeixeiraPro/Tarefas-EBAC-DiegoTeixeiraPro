package br.com.diego.services;

import br.com.diego.domain.Cliente;
import br.com.diego.exceptions.DAOException;
import br.com.diego.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
    Cliente buscarPorCPF(Long cpf) throws DAOException;
}