package principal;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema do professor. Por favor lançar as notas do Aluno");

        System.out.println("Digite a nota da primeira avaliação: ");
        double nota1 = s.nextInt();

        System.out.println("Digite a nota da segunda avaliação: ");
        double nota2 = s.nextInt();

        System.out.println("Digite a nota da terceira avaliação: ");
        double nota3 = s.nextInt();

        System.out.println("Digite a nota da quarta avaliação: ");
        double nota4 = s.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do Aluno foi: " + media);

        if (media <= 4.9999) {
            System.out.println("O aluno foi Reprovado");
        } else if (media >= 7) {
            System.out.println("O aluno foi Aprovado");
        } else {
            System.out.println("O aluno está em Recuperação");
        }
    }
}