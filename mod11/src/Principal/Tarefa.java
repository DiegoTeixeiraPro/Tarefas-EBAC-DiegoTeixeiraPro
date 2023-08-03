package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa {

    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList();

        listaNomes.add("Zeca Almeida-M");
        listaNomes.add("Erica de Souza-F");
        listaNomes.add("Amanda Ferreira-F");
        listaNomes.add("Marcelo Oliveira-M");

        System.out.println("Lista sem ordenação alfabética: " + listaNomes);

        Collections.sort(listaNomes);
        System.out.println("Lista com ordenação alfabética: " + listaNomes + "\n");


        System.out.println("Gênero Masculino:");
        for (int i = 0; i < listaNomes.size(); i++) {
            if (listaNomes.get(i).contains("-M")) {
                System.out.println(listaNomes.get(i));
            }
        }

        System.out.println(" ");

        System.out.println("Gênero Feminino:");
        for (int i = 0; i < listaNomes.size(); i++) {
            if (listaNomes.get(i).contains("-F")) {
                System.out.println(listaNomes.get(i));
            }
        }
    }
}