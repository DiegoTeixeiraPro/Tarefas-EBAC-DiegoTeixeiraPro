import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<? extends Carro> listaDeCarros;

        Civic civic = new Civic();
        Corolla corolla = new Corolla();

        List<Carro> novaLista = new ArrayList<>();
        novaLista.add(civic);
        novaLista.add(corolla);

        listaDeCarros = novaLista;

        for (Carro carro : listaDeCarros) System.out.println(carro);

    }
}