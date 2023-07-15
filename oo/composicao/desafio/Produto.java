package oo.composicao.desafio;

public class Produto {
    String nameProduct;
    double priceProduct;
    Produto () {}

    Produto (String getProductName, double getProductPrice) {
        this.nameProduct = getProductName;
        this.priceProduct = getProductPrice;
    }

}
