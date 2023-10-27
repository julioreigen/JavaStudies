package oo_06.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Item i) {
        itens.add(i);
        }
    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterCompraValor() {
        double valorCompra = 0.0;
        for (Item i : itens) {
            valorCompra += i.produto.precoProduto * i.qntdItem;
        }
        return valorCompra;
    }
}
