package oo.composicao.desafio;

public class Interface {
    public static void main(String[] args) {
        Produto corretivo = new Produto("Corretivo", 2);
        Produto mochila = new Produto("Mochila", 21.39);

        Item i3 = new Item(corretivo, 2);
        Item i4 = new Item(mochila, 1);

        Compra c1 = new Compra();
        c1.adicionarItem("Caderno", 12.4, 2);
        c1.adicionarItem("Caneta azul", 2.35, 5);
        c1.adicionarItem("Notebook", 3646.90, 1);

        Compra c2 = new Compra();
        c2.adicionarItem(i3);
        c2.adicionarItem(i4);

        Cliente cliente_1 = new Cliente("Julio");
        cliente_1.adicionarCarrinho(c1);

        Cliente cliente_2 = new Cliente("João");
        cliente_2.adicionarCarrinho(c2);

        System.out.printf("O cliente %s gastou R$%.2f em %d produtos\n", cliente_1.nome, cliente_1.obterValorTotal(), cliente_1.obterProdutos());
        System.out.printf("O cliente %s gastou R$%.2f em %d produtos\n", cliente_2.nome, cliente_2.obterValorTotal(), cliente_2.obterProdutos());
    }
}
