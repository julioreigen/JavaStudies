package oo_06.composicao;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Estudante(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso: this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    void adicionarCurso(Curso c) {
        this.cursos.add(c);
        c.alunos.add(this);
    }
}
