package excecao_09.personalizadaA;

import excecao_09.Aluno;
import excecao_09.personalizadaA.NumeroForaIntervaloException;
import excecao_09.personalizadaA.StringVaziaException;

public class Validar {
    private Validar() {}

    public static void aluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.getNota() < 0 || aluno.getNota() > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
