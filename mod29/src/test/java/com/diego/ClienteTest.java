package com.diego;

import com.diego.dao.ClienteDAO;
import com.diego.dao.IClienteDAO;
import com.diego.domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Diego");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void consultarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Diego");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void consultarTodosTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        List<Cliente> clientes = dao.consultarTodos();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
    }


    @Test
    public void atualizarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Diego");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        cliente.setNome("Diego Atualizado");

        Integer qtdAtualizacao = dao.atualizar(cliente);
        assertTrue(qtdAtualizacao == 1);

        Cliente clienteAtualizado = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteAtualizado);
        assertEquals(cliente.getCodigo(), clienteAtualizado.getCodigo());
        assertEquals(cliente.getNome(), clienteAtualizado.getNome());

        Integer qtdDel = dao.excluir(clienteAtualizado);
        assertNotNull(qtdDel);
    }

    @Test
    public void excluirTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Diego");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
        assertTrue(qtdDel == 1);

        Cliente clienteExcluido = dao.consultar(cliente.getCodigo());
        assertNull(clienteExcluido);
    }
}