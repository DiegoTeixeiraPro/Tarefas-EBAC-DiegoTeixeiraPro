package recursao;

public class Recursao {
    public static int calcFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int entrada = 7;

        int saida = calcFatorial(entrada);

        System.out.println("Fatorial de " + entrada + " é: " + saida);
    }
}