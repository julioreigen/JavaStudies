package streams;

import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class GerarAndIterar {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        // GENERATE:
        System.out.println("Generate:");
        // Gerando stream de inteiros aleatórios
        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(println);

        System.out.println();
        // Gerando stream de doubles aleatórios
        Stream.generate(new Random()::nextDouble)
                .limit(8).forEach(println);


        // ITERATE:
        System.out.println("\nIterate:");
        // Iterar stream do 0 ao 10
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(println);

        System.out.println();
        // Stream de números ímpares
        Stream.iterate(0, n -> n + 1)
                .filter(x -> x % 2 != 0) // Ímpar
                .limit(10)
                .forEach(println);

        System.out.println();
        // Fibonacci
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(n -> n[0])
                .forEach(println);

        System.out.println();
        // Parar stream se n >= 20
        Stream.iterate(1, n -> n < 20, n -> n * 2)
                .forEach(println);
    }
}
