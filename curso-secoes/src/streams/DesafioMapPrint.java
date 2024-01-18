package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMapPrint {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para string binária... 6 ≥ "110"
         * 2. Reverter a string... "110" ≥ "011"
         * 3. Converter de volta para inteiro... "011" ≥ 3
         */

        // Nesta classe o desafio foi feito sem utilizar novas variáveis, apenas usando println.

        Consumer<String> println = System.out::println;

        // Converter para string binária
        System.out.println("Primeira etapa: ");
        numeros.stream().map(Integer::toBinaryString).forEach(println);

        // Reverter a string
        System.out.println("\n\nSegunda etapa: ");
        numeros.stream()
                .map(Integer::toBinaryString)
                .map(n -> {
                    StringBuilder str = new StringBuilder(n);
                    str.reverse();
                    return str.toString();
                })
                .forEach(println);

        // Converter string binária para inteiro
        System.out.println("\n\nTerceira etapa: ");
        numeros.stream()
                .map(Integer::toBinaryString)
                .map(n -> {
                    StringBuilder str = new StringBuilder(n);
                    str.reverse();
                    return str.toString();
                })
                .map(n -> {
                    int inteiro = Integer.parseInt(n, 2);
                    return inteiro + "";
                })
                .forEach(println);
    }
}