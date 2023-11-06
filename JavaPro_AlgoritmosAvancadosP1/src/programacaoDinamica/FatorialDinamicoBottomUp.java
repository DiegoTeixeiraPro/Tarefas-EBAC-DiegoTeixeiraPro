package programacaoDinamica;

import java.math.BigInteger;

public class FatorialDinamicoBottomUp {
    public static BigInteger calcularFatorial(int n) {
        BigInteger[] memo = new BigInteger[n + 1];
        memo[0] = BigInteger.ONE;
        memo[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            memo[i] = BigInteger.valueOf(i).multiply(memo[i - 1]);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int entrada = 7;

        BigInteger saida = calcularFatorial(entrada);

        System.out.println("Fatorial de " + entrada + " é: " + saida);
    }
}