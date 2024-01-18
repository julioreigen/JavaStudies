package streams_08;

import excecao_09.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, 52.3);
        Aluno a2 = new Aluno("Bia", 5.8, 72.4);
        Aluno a3 = new Aluno("Daniel", 9.8, 49.9);
        Aluno a4 = new Aluno("Gui", 6.8, 92);
        Aluno a5 = new Aluno("Rebeca", 7.1, 97.9);
        Aluno a6 = new Aluno("Pedro", 8.8, 34.7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.getNome() + "! Você foi aprovado(a)!\nPresença nas aulas: %.0f".formatted(a.getPresenca()) + "%";

        Predicate<Aluno> presenca = a -> a.getPresenca() >= 50;

        alunos.stream()
                .filter(aprovado)
                .filter(presenca)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }

}
