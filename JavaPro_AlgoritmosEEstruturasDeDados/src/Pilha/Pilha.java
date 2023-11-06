package Pilha;

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("A pilha está cheia!!! Sendo assim, não é possível adicionar mais elementos.");
            return;
        }
        topo++;
        elementos[topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!!! Portanto não é possível remover elementos.");
        }
        int valor = elementos[topo];
        topo--;
        return valor;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!!! Não há elementos para retornar.");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}