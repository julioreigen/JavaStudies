package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Estudante> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Estudante aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
 }
