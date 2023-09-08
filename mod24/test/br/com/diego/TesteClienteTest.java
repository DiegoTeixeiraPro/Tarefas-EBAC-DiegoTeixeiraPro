package br.com.diego;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Diego");
        cli.adicionarNome1("Diego");

        Assert.assertEquals("Diego", cli.getNome());
    }
}