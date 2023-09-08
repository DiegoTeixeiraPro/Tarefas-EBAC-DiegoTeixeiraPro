package br.com.diego.dao.mocks;

import br.com.diego.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        System.out.println("Mock: Contrato salvo com sucesso!");
    }

    @Override
    public void buscar() {
        System.out.println("Mock: Busca realizada com sucesso!");
    }

    @Override
    public void excluir() {
        System.out.println("Mock: Exclusão realizada com sucesso!");
    }

    @Override
    public void atualizar() {
        System.out.println("Mock: Atualização realizada com sucesso!");
    }
}