package FilaFIFO;

public class FilaFIFO {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaFIFO(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("A fila está cheia!!! Não é possível adicionar novos elementos.");
            return;
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = valor;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!!! Não é possível remover elementos.");
        }
        int valor = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!!! Portanto não há elementos no fim da fila.");
        }
        return elementos[fim];
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!!! Portanto não há elementos na frente da fila.");
        }
        return elementos[inicio];
    }
}