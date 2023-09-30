import com.diego.domain.Acessorio;
import com.diego.domain.Carro;
import com.diego.domain.Marca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    public void testSetMarca() {
        Carro carro = new Carro();
        Marca marca = new Marca();
        marca.setNome("Porsche");
        carro.setMarca(marca);
        assertEquals(marca, carro.getMarca());
    }

    @Test
    public void testSetModelo() {
        Carro carro = new Carro();
        carro.setModelo("911");
        assertEquals("911", carro.getModelo());
    }

    @Test
    public void testAcessorioList() {
        Carro carro = new Carro();
        Acessorio acessorio1 = new Acessorio();
        Acessorio acessorio2 = new Acessorio();

        acessorio1.setNome("Capa para chave canivete couro");
        acessorio2.setNome("Rodas aro 21 exclusive");

        carro.getAcessorios().add(acessorio1);
        carro.getAcessorios().add(acessorio2);

        assertEquals(2, carro.getAcessorios().size());
        assertTrue(carro.getAcessorios().contains(acessorio1));
        assertTrue(carro.getAcessorios().contains(acessorio2));
    }

    @Test
    public void testAcessorioListAfterRemove() {
        Carro carro = new Carro();
        Acessorio acessorio1 = new Acessorio();
        Acessorio acessorio2 = new Acessorio();

        acessorio1.setNome("Capa para chave canivete couro");
        acessorio2.setNome("Rodas aro 21 exclusive");

        carro.getAcessorios().add(acessorio1);
        carro.getAcessorios().add(acessorio2);

        carro.getAcessorios().remove(acessorio1);

        assertEquals(1, carro.getAcessorios().size());
        assertFalse(carro.getAcessorios().contains(acessorio1));
        assertTrue(carro.getAcessorios().contains(acessorio2));
    }
}