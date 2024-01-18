package oo.composicao.desafioPessoal;

public class Produto {
    String nome;
    double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

}
