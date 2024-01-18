package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> calcDesconto = produto ->
                produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> calcImposto = preco ->
                preco >= 2500 ? preco + (preco * 0.085) : preco;
        UnaryOperator<Double> calcFrete = preco ->
                preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100) / 100.00;
        // Outra forma de arredondar o preço:
        // Double.parseDouble(String.format("%.2f", preco));

        Function <Double, String> formatar = preco ->
                ("R$" + preco).replace(".", ",");

        Produto p1 = new Produto("iPad", 3235.89, 0.13);

        System.out.printf("O preço final é: %s", calcDesconto
                .andThen(calcImposto)
                .andThen(calcFrete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p1));
    }
}
