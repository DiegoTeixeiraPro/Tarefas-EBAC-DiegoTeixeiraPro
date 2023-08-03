package principal;

public class Main {
    public static void main(String[] args) {
        operacaoMedia();
    }

    public static void operacaoMedia() {
        double nota1 = 8.5;
        double nota2 = 9.5;
        double nota3 = 7.5;
        double nota4 = 8.5;

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média do aluno é: " + media);
    }
}