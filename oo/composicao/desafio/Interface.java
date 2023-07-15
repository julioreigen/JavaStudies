package oo.composicao.desafio;

public class Interface {
    public static void main(String[] args) {
        Produto sketchbook = new Produto("Sketch Book", 12.4);
        Produto pen = new Produto("Blue Pen", 2.35);
        Produto liquidpaper = new Produto("Liquid Paper", 2);
        Produto backpack = new Produto("Backpack", 21.39);

        Item i1 = new Item(sketchbook, 2);
        Item i2 = new Item(backpack, 1);
        Item i3 = new Item(liquidpaper, 3);
        Item i4 = new Item(pen, 5);

        Compra purchase_1 = new Compra();
        purchase_1.addItem(i2);
        purchase_1.addItem(i3);

        Compra purchase_2 = new Compra();
        purchase_2.addItem(i4);
        purchase_2.addItem(i1);

        Cliente c1 = new Cliente("Julio");
        c1.addPurchase(purchase_2);

        Cliente c2 = new Cliente("João");
        c2.addPurchase(purchase_1);

        System.out.printf("Cliente 1 gastou um total de R$%.2f", c1.getTotalValue());
    }
}
