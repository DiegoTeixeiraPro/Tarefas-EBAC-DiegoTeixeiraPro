import java.util.Arrays;

public class AlgoritmoGuloso {
    public static void darTroco(int quantia, int[] moedas) {
        Arrays.sort(moedas);
        int index = moedas.length - 1;

        while (quantia > 0 && index >= 0) {
            if (moedas[index] <= quantia) {
                int numMoedas = quantia / moedas[index];
                quantia -= numMoedas * moedas[index];
                System.out.println("Moedas de " + moedas[index] + ": " + numMoedas);
            }
            index--;
        }
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};

        System.out.println("Troco de " + quantia + " utilizando moedas de " + Arrays.toString(moedas));
        darTroco(quantia, moedas);
    }
}