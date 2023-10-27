package oo_06.composicao.desafio;

public class Item {
    final int qntdItem;
    final Produto produto;

    Item(Produto produto, int qntdItem) {
        this.qntdItem = qntdItem;
        this.produto = produto;
    }
}
