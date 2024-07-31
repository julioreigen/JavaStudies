package teste.composicao;

import infra.Dao;
import modelo.composicao.Funcionario;

public class ObterFuncionario {
    public static void main(String[] args) {
        Dao<Funcionario> dao = new Dao<>(Funcionario.class);

        Funcionario f = dao.obterPorId(1L);
        dao.fechar();

        System.out.println(f.getNome());
    }
}
