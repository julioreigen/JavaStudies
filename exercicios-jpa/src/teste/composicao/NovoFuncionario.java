package teste.composicao;

import infra.Dao;
import modelo.composicao.Endereco;
import modelo.composicao.Funcionario;

public class NovoFuncionario {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Quipá", "Casa nº 13");
        Funcionario funcionario = new Funcionario("Brito", endereco);

        Dao<Funcionario> dao = new Dao<>();
        dao.incluirAtomico(funcionario);
    }
}
