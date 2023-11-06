package programacaoDinamica;

import java.math.BigInteger;
import java.util.HashMap;

public class FatorialDinamicoTopDown {
    static HashMap<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        BigInteger resultado = BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int entrada = 7;

        BigInteger saida = calcularFatorial(entrada);

        System.out.println("Fatorial de " + entrada + " é: " + saida);
    }
}