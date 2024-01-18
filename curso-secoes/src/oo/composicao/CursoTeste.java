package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("João");
        Estudante aluno2 = new Estudante("Maria");
        Estudante aluno3 = new Estudante("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Java Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Estudante aluno: curso3.alunos) {
            System.out.println("Estou matriculado no curso " + curso3.nome + "...");
            System.out.println("E o meu nome é " + aluno.nome);
            System.out.println();
        }
        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
