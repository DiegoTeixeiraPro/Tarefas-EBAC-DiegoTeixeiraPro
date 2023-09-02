package fabricadecarros;

public class Main {
    public static void main(String[] args) {
        CarroFactory fabricaCompacto = new CarroCompactoFactory();
        CarroFactory fabricaSedan = new CarroSedanFactory();
        CarroFactory fabricaSUV = new CarroSUVFactory();

        Carro carro1 = fabricaCompacto.criarCarro();
        Carro carro2 = fabricaSedan.criarCarro();
        Carro carro3 = fabricaSUV.criarCarro();

        carro1.montar();
        carro2.montar();
        carro3.montar();
    }
}