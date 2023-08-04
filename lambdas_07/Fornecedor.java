package lambdas_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(umaLista.get());


        // O código abaixo foi escrito apenas para tirar uma dúvida minha.

        Function<Integer, List<Integer>> contagem = quantidade -> {
            List<Integer> lista = new ArrayList<>();
            for (int i = 1; i <= quantidade; i++) {
                lista.add(i);
            }
            return lista;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("A contagem vai até que número? ");
        int quantidade = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Sua contagem: " + contagem.apply(quantidade));
    }
}
