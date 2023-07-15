package oo.composicao.desafio;

public class Item {
    int qntdItem;
    Produto product;

    Item(Produto getProduct, int getQntdItem) {
        qntdItem = getQntdItem;
        product = getProduct;
    }
}
