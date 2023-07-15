package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> items;

    Compra() {
        this.items = new ArrayList<>();
    }
    void addItem(Item item) {
        items.add(item);
    }
    void removeItem(Item item) {
        items.add(item);
    }
    double getPurchasePrice () {
        double total_purchase = 0;
        for (Item i: items) {
            total_purchase += i.product.priceProduct * i.qntdItem;
        }
        return total_purchase;
    }

}
