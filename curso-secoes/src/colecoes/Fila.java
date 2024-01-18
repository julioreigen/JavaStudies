package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add ≥ adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Lança uma excessão
        fila.offer("Bia"); // Retorna false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");


        // Peek e Element ≥ obtém o próximo elemento sem remover.
        // A diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // Lista vazia = Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lista vazia = Erro na execução
        System.out.println(fila.element());


        // Pool e Remove -> obtém o próximo elemento e remove!
        System.out.println(fila.poll()); // Lista vazia = Retorna false
        System.out.println(fila.remove()); // Lista vazia = Erro na execução
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);
    }
}
