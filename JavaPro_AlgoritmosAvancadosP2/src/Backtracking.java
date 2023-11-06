import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static List<List<Integer>> subconjuntos(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        subconjuntosAux(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void subconjuntosAux(int[] S, int n, int index, List<Integer> atual, List<List<Integer>> result) {
        if (atual.size() == n) {
            result.add(new ArrayList<>(atual));
            return;
        }

        for (int i = index; i < S.length; i++) {
            atual.add(S[i]);
            subconjuntosAux(S, n, i + 1, atual, result);
            atual.remove(atual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] entrada1 = {1, 2, 3};
        int n1 = 2;

        List<List<Integer>> saida1 = subconjuntos(entrada1, n1);

        System.out.println("Subconjuntos de " + n1 + " elementos em " + java.util.Arrays.toString(entrada1) + ":");
        for (List<Integer> subconjunto : saida1) {
            System.out.print(subconjunto);
        }

        int[] entrada2 = {1, 2, 3, 4};
        int n2 = 1;

        List<List<Integer>> saida2 = subconjuntos(entrada2, n2);

        System.out.println("\nSubconjuntos de " + n2 + " elementos em " + java.util.Arrays.toString(entrada2) + ":");
        for (List<Integer> subconjunto : saida2) {
            System.out.print(subconjunto);
        }
    }
}