package teste.heranca;

import infra.Dao;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {

        Dao<Aluno> alunoDao = new Dao<>();

        Aluno aluno1 = new Aluno("Julio", 123L);
        AlunoBolsista aluno2 = new AlunoBolsista("Maria", 345L, 1000);
        alunoDao.incluirAtomico(aluno1);
        alunoDao.incluirAtomico(aluno2);

        alunoDao.fechar();
    }
}
