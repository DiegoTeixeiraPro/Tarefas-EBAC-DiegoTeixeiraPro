package fabricadecarros;

public class CarroSedanFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}