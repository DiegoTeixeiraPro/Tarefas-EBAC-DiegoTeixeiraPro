package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Olá, por favor digite o nome e o gênero, separados por traço e vírgula.");
        System.out.println("Exemplo:\n" + "MARCIO-MASCULINO,LUARA-FEMININO,LETICIA-FEMININO\n");

        System.out.print("DIGITE: ");
        String input = scanner.nextLine();
        String[] pessoas = input.split(",");

        for (String pessoa : pessoas) {
            lista.add(pessoa);
        }

        List<String> listaMulheres = lista.stream()
                .filter(p -> p.split("-")[1].equals("FEMININO"))
                .toList();

        System.out.println("\nLista das Mulheres: ");
        listaMulheres.forEach(System.out::println);
        scanner.close();
    }

    public static List<String> filtrarMulheres(List<String> pessoas) {
        return pessoas.stream()
                .filter(p -> p.split("-")[1].equals("FEMININO"))
                .toList();
    }
}