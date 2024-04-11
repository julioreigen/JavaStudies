package teste.basico;

import infra.ProdutoDao;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> produtos = dao.obterTodos();

        for(Produto produto: produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

        double precoTotal = produtos
                .stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);

        System.out.printf("O valor total é: R$%.2f \n", precoTotal);

        dao.fechar();
    }
}
