package fabricadecarros;

public class CarroCompactoFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroCompacto();
    }
}