package principal;

public class Main {

    public static void main(String[] args) {

            Carro carro1 = new Carro();

            carro1.marca = "Jeep";
            carro1.modelo = "Compass";
            carro1.anoModelo = 2023;
            carro1.velocidadeAtual = 0;

            carro1.acelerar(60);
            System.out.println("A velocidade do carro é de " + carro1.velocidadeAtual + " km/h");

            System.out.println("A lombada chegou, reduzindo 30 km/h");
            carro1.frear(40);

            System.out.println("A velocidade do carro é de " + carro1.velocidadeAtual + " km/h");
    }

}
