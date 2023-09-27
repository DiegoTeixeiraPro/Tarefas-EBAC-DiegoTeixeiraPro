package br.com.diego.services;

import br.com.diego.dao.IClienteDAO;
import br.com.diego.domain.Cliente;
import br.com.diego.exceptions.DAOException;
import br.com.diego.exceptions.MaisDeUmRegistroException;
import br.com.diego.exceptions.TableException;
import br.com.diego.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}