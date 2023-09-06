public class Main {
    @MinhaAnotacao(autor = "Diego Teixeira", data = "2023-09-06", descricao = "Método de soma simples")
    public static int somaSimples(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(somaSimples(5, 4));
    }
}