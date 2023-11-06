package Pilha;

public class MainPilha {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Adicionando à pilha: 6, 8, 40 e 80");
        pilha.push(6);
        pilha.push(8);
        pilha.push(40);
        pilha.push(80);
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Removendo elemento: " + pilha.pop());

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}