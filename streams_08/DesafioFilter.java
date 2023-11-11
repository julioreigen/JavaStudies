package streams_08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto("Boneco Ben 10", 49.99, 6.49, 0.15));
        carrinho.add(new Produto("Boneco Hulk", 49.99, 6.49, 0.15));
        carrinho.add(new Produto("Bicicleta Cannondale", 399.90, 0, 0.25));
        carrinho.add(new Produto("Televisão 50\"", 2460, 60, 0.28));

        Predicate<Produto> superPromocao = produto -> produto.desconto() >= 0.2;
        Predicate<Produto> freteGratis = p -> p.frete() == 0;

        Function<Produto, String> infoPromocao =
                p -> {
            double desconto = p.preco() * p.desconto();
            double precoComDesconto = p.preco() - (desconto);
            String descontoPorcento = String.format("%.0f", p.desconto() * 100) + "%";
            return String.format("%s está em super promoção com frete grátis!!\nDesconto: R$%.2f (%s)\nPreço do produto com o desconto: R$%.2f\n", p.nome(), desconto, descontoPorcento, precoComDesconto);
        };

        carrinho.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .map(infoPromocao)
                .forEach(System.out::println);
    }
}
