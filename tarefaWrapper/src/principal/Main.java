package principal;

public class Main {

    public static void main(String[] args) {

        int numero = 60;
        System.out.println(numero);

        //Exemplo de Casting Implícito
        long numeroLong = numero;
        System.out.println(numeroLong);

        //Exemplo de Casting Explícito
        short numeroShort = (short) numero;
        System.out.println(numeroShort);
    }
}