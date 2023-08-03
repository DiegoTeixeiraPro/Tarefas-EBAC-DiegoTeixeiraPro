package principal;

public class Carro {

    //Variáveis
    String marca;
    String modelo;
    int anoModelo;
    int velocidadeAtual;

    //Métodos
    void acelerar(int aumentar) {
        velocidadeAtual+=aumentar;
    }
    void frear(int reduzir) {
        velocidadeAtual-=reduzir;
    }
}
