package streams_08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para string binária... 6 ≥ "110"
         * 2. Inverter a string... "110" ≥ "011"
         * 3. Converter de volta para inteiro... "011" ≥ 3
         */


        // Função para inverter a string
        UnaryOperator<String> inverterString =
                s -> new StringBuilder(s).reverse().toString();

        // Função para transformar binário em inteiro
        Function<String, Integer> converterParaInteiro =
                s -> Integer.parseInt(s, 2);

        numeros.stream()
                .map(Integer::toBinaryString)
                .map(inverterString)
                .map(converterParaInteiro)
                .forEach(System.out::println);
    }
}
