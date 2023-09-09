package br.com.diego.services;

import br.com.diego.dao.IProdutoDAO;
import br.com.diego.domain.Produto;
import br.com.diego.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}