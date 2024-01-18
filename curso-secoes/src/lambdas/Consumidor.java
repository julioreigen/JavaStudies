package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Banana", 2.50, 0.09);

        imprimirNome.accept(p1); // Para acionar a função manualmente.

        Produto p2 = new Produto("Maça", 1.50, 0.05);
        Produto p3 = new Produto("Laranja", 3.50, 0.10);
        Produto p4 = new Produto("Pêra", 4.50, 0.15);
        Produto p5 = new Produto("Uva", 5.50, 0.20);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome); // imprime o nome

        produtos.forEach(p -> System.out.println(p.preco)); // imprime o preço

        produtos.forEach(System.out::println); // imprime o produto com toString
    }
}
