package oo_06.composicao.desafioPessoal;

public class Cliente {
    private final String nome;
    private final Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}