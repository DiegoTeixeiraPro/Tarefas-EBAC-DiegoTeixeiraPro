package FilaFIFO;

public class MainFilaFIFO {
    public static void main(String[] args) {

        FilaFIFO filaFIFO = new FilaFIFO(10);

        System.out.println("A fila está vazia? " + filaFIFO.isEmpty());
        System.out.println("Adicionando à fila: 6, 8, 40 e 80");
        filaFIFO.enqueue(6);
        filaFIFO.enqueue(8);
        filaFIFO.enqueue(40);
        filaFIFO.enqueue(80);
        System.out.println("A fila está vazia? " + filaFIFO.isEmpty());

        System.out.println("Tamanho da fila: " + filaFIFO.size());

        System.out.println("Frente da fila: " + filaFIFO.front());
        System.out.println("Fim da fila: " + filaFIFO.rear());

        System.out.println("Removendo elemento: " + filaFIFO.dequeue());
        System.out.println("Frente da fila: " + filaFIFO.front());
        System.out.println("Tamanho da fila: " + filaFIFO.size());
        System.out.println("A fila está vazia? " + filaFIFO.isEmpty());
    }
}