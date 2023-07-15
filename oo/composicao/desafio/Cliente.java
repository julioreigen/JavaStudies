package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nameClient;
    List<Compra> list = new ArrayList<>();

    Cliente(String getClientName) {
        nameClient = getClientName;
    }

    void addPurchase(Compra compra) {
        list.add(compra);
    }

    double getTotalValue() {
        double total = 0.0;
        for (Compra c: list) {
            total += c.getPurchasePrice();
        }
        return total;
    }
}
