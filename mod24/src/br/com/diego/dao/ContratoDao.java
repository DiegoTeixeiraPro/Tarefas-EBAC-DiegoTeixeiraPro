package br.com.diego.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        System.out.println("Buscar contrato: Operação bem-sucedida");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir contrato: Operação bem-sucedida");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizar contrato: Operação bem-sucedida");
    }
}