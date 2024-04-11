package teste.basico;

import infra.Dao;
import modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Monitor", 789.99);

        Dao<Produto> dao = new Dao<>(Produto.class);
        dao.incluirAtomico(produto).fechar();
//      dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();

        System.out.println("Id do produto: " + produto.getId());

    }
}
