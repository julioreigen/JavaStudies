package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> carrinho = new ArrayList<>();

    void adicionarItem(Item item) {
        this.carrinho.add(item);
        item.compra = this;
    }
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item: carrinho) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
