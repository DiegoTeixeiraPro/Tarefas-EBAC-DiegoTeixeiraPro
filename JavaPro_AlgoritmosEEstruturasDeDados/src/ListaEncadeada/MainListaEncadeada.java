package ListaEncadeada;
public class MainListaEncadeada {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Adicionando à lista: 6, 8, 40 e 80");
        lista.push(new Node(6));
        lista.push(new Node(8));
        lista.push(new Node(40));
        lista.push(new Node(80));
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.print("Elementos da lista: ");
        lista.printList();

        Node removedNode = lista.pop();
        System.out.println("Nó removido: " + removedNode.data);
        System.out.print("Elementos da lista: ");
        lista.printList();
        System.out.println("Tamanho da lista: " + lista.size());
        lista.insert(1, new Node(40));
        lista.printList();
        System.out.println("Tamanho da lista: " + lista.size());
        lista.remove(1);
        lista.printList();
        System.out.println("Tamanho da lista: " + lista.size());
        Node element = lista.elementAt(1);
        System.out.println("Elemento no índice 1: " + element.data);
    }
}