package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4356.89, 0.25);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.printf("%s        %.2f\n", p1.nome, p1.preco);
        System.out.printf("%s    %.2f\n", p2.nome, p2.preco);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho = R$%.2f\n", mediaCarrinho);

        System.out.printf("Preço final %s: %.2f\n", p1.nome, precoFinal1);
        System.out.printf("Preço final %s: %.2f\n", p2.nome, precoFinal2);

    }
}
