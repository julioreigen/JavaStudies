package oo.composicao.desafioPessoal;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * O que eu quero:
 * Interface perguntando qual é a função desejada:
 * MENU DE FUNCIONÁRIO:
 * Adicionar novo produto ao estoque
 * Remover um produto do estoque
 * MENU DE COMPRA:
 * Adicionar cliente
 * Selecionar cliente existente
 * Ao selecionar cliente, dá a opção de colocar coisas ao carrinho
 */

public class Interface {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        // Produtos iniciais
        estoque.adicionarProduto(new Produto("Camiseta", 29.99));
        estoque.adicionarProduto(new Produto("Calça", 49.99));
        estoque.adicionarProduto(new Produto("Tênis", 99.99));

        Scanner input = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        boolean executar = true;
        while (executar) {
            hash();
            System.out.print("""
                    Selecione uma opção:
                    1. Adicionar produto ao estoque
                    2. Adicionar novo cliente
                    3. Adicionar produto ao carrinho de um cliente
                    4. Exibir produtos no estoque
                    5. Exibir produtos no carrinho de um cliente
                    6. Remover produto do estoque
                    7. Remover produto do carrinho
                    0. Sair
                    >\s""");

            int opcao = Integer.parseInt(input.nextLine());
            int i = 0;
            int id;
            List<Produto> produtosNoEstoque = estoque.getProdutos();

            switch (opcao) {
                case 1 -> {
                    // Lógica para adicionar produtos ao estoque
                    hash();
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = input.nextLine();
                    System.out.print("Digite o preço do produto: R$");
                    double precoProduto = Double.parseDouble(input.nextLine().replace(",", "."));
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    estoque.adicionarProduto(produto);
                    System.out.println("Produto adicionado ao estoque: " + produto.getNome());
                }
                case 2 -> {
                    // Lógica para adicionar novo cliente
                    hash();
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = input.nextLine();
                    clientes.add(new Cliente(nomeCliente));
                    System.out.println("Novo cliente adicionado!");
                }
                case 3 -> {
                    // Lógica para adicionar produtos ao carrinho do cliente
                    hash();
                    System.out.println("Lista de clientes: ");
                    for (Cliente u : clientes) {
                        System.out.printf("ID: %d   ", i);
                        System.out.printf("Nome: %s\n", u.getNome());
                        i++;
                    }
                    do {
                        System.out.print("Selecione um cliente pelo id: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= clientes.size() || id < 0);
                    i = 0;
                    System.out.println("Produtos disponíveis: ");
                    for (Produto p : produtosNoEstoque) {
                        System.out.println(i + " - " + p.getNome() + " - R$" + p.getPreco());
                        i++;
                    }
                    do {
                        System.out.print("Selecione um produto pelo id: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= produtosNoEstoque.size() || id < 0);
                    clientes.get(id).getCarrinho().adicionarProduto(produtosNoEstoque.get(id));
                    System.out.println("Adicionado!");
                    i = 0;
                }
                case 4 -> {
                    // Lógica para mostrar produtos em estoque
                    hash();
                    System.out.println("Produtos no estoque:");
                    for (Produto p : produtosNoEstoque) {
                        System.out.println(i + " - " + p.getNome() + " - R$" + p.getPreco());
                        i++;
                    }
                    i = 0;
                }
                case 5 -> {
                    hash();
                    // Lógica para exibir produtos no carrinho de um cliente
                    System.out.println("Lista de clientes: ");
                    for (Cliente u : clientes) {
                        System.out.printf("ID: %d   ", i);
                        System.out.printf("Nome: %s\n", u.getNome());
                        i++;
                    }
                    do {
                        System.out.print("Selecione um cliente pelo id: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= clientes.size() || id < 0);
                    System.out.printf("Produtos no carrinho de %s: \n", clientes.get(id).getNome());
                    List<Produto> produtosNoCarrinho = clientes.get(id).getCarrinho().getProdutos();
                    for (Produto p : produtosNoCarrinho) {
                        System.out.println(p.getNome() + " - R$" + p.getPreco());
                    }
                    i = 0;
                }
                case 6 -> {
                    // Lógica para remover um produto do estoque
                    System.out.println("Produtos disponíveis: ");
                    for (Produto p : produtosNoEstoque) {
                        System.out.println(i + " - " + p.getNome() + " - R$" + p.getPreco());
                        i++;
                    }
                    do {
                        System.out.print("Digite o ID do produto que deseja remover: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= produtosNoEstoque.size() || id < 0);
                    estoque.removerProduto(produtosNoEstoque.get(id));
                    System.out.println("Produto removido!");
                }
                case 7 -> {
                    // Lógica para remover produtos do carrinho do cliente
                    hash();
                    System.out.println("Lista de clientes: ");
                    for (Cliente u : clientes) {
                        System.out.printf("ID: %d   ", i);
                        System.out.printf("Nome: %s\n", u.getNome());
                        i++;
                    }
                    do {
                        System.out.print("Selecione um cliente pelo id: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= clientes.size() || id < 0);
                    i = 0;
                    System.out.println("Produtos disponíveis: ");
                    for (Produto p : produtosNoEstoque) {
                        System.out.println(i + " - " + p.getNome() + " - R$" + p.getPreco());
                        i++;
                    }
                    do {
                        System.out.print("Selecione um produto a ser removido pelo id: ");
                        id = Integer.parseInt(input.nextLine());
                    } while (id >= produtosNoEstoque.size() || id < 0);
                    clientes.get(id).getCarrinho().removerProduto(produtosNoEstoque.get(id));
                    System.out.println("Removido!!");
                    i = 0;
                }
                case 0 -> {
                    hash();
                    executar = false;
                }
                default -> {
                    hash();
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
        System.out.println("Programa encerrado.");
    }
    static void hash() {
        System.out.println("#########################################");
    }
}