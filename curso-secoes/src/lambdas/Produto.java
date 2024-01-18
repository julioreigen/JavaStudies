package lambdas;

import java.text.DecimalFormat;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + " tem preço de R$" + df.format(precoFinal);
    }
}
