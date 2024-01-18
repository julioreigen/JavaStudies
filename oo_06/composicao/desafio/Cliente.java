package oo_06.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Compra>  carrinho = new ArrayList<>();
    String nome;

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCarrinho(Compra compra){
        carrinho.add(compra);
    }

    double obterValorTotal() {
        double valorTotal = 0.0;
        for (Compra c: carrinho) {
            valorTotal += c.obterCompraValor();
        }
        return valorTotal;
    }
    int obterProdutos() {
        int totalP = 0;
        for (Compra compra: carrinho) {
            for (Item i: compra.itens) {
                totalP += i.qntdItem;
            }
        }
        return totalP;
    }
}
