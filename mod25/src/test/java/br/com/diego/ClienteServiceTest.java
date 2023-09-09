package br.com.diego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.diego.dao.ClienteDaoMock;
import br.com.diego.dao.IClienteDAO;
import br.com.diego.domain.Cliente;
import br.com.diego.exceptions.TipoChaveNaoEncontradaException;
import br.com.diego.services.ClienteService;
import br.com.diego.services.IClienteService;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Diego");
        cliente.setCidade("São Paulo");
        cliente.setEnd("Endereço Completo");
        cliente.setEstado("SP");
        cliente.setNumero(100);
        cliente.setTel(1199999999L);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Diego");
        clienteService.alterar(cliente);

        Assert.assertEquals("Diego", cliente.getNome());
    }
}