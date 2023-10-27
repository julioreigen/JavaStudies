package streams_08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando o forEach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando o Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        //noinspection WhileLoopReplaceableByForEach
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno
    }
}