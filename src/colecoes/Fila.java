package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // A diferença de comportamento ocorre quando a fila está cheia
        fila.add("Luana"); // retorna falso
        fila.offer("Bia"); // lança exceçao
        fila.add("Pedro");
        fila.offer("Carlos");
        fila.add("Joao");
        fila.offer("Paulo");

        // Peed e Element -> obter o próximo elemento da fila sem remover
        // A diferença de comportamento ocorre quando a fila está vazia
        System.out.println(fila.peek()); // retorna falso
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança exceçao
        System.out.println(fila.element());

        // Poll e Remove -> obter o próximo elemento da fila e remover
        // A diferença de comportamento ocorre quando a fila está vazia
        System.out.println(fila.poll()); // retorna falso
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança exceçao
        System.out.println(fila.remove());

//        fila.clear(); limpa a fila
//        fila.isEmpty(); saber se está vazia
//        fila.size(); tamanho da fila
//        fila.contains(); saber se determinado elemento está na fila
    }
}
