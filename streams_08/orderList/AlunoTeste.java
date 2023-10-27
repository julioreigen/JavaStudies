package streams_08.orderList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AlunoTeste {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno("William", 15, 8.2));
        listaAlunos.add(new Aluno("Gui", 14, 9.0));
        listaAlunos.add(new Aluno("Luca", 16, 7.5));
        listaAlunos.add(new Aluno("Ana", 14, 6.0));
        listaAlunos.add(new Aluno("João", 16, 9.8));

        // Utilizando Stream API para mostrar os alunos ordenando por nota
        Stream<Aluno> stream = listaAlunos.stream();
        stream.sorted(Comparator.comparing(Aluno::getNota)).forEach(System.out::println);
        System.out.println();

        // A partir daqui não estou mais utilizando Stream API
        System.out.println("Lista normal: " + listaAlunos);

        listaAlunos.sort(Comparator.comparing(Aluno::getNota));
        System.out.println("\nLista ordenada por nota: " + listaAlunos);

        listaAlunos.sort(Comparator.comparing(Aluno::getIdade));
        System.out.println("\nLista ordenada por idade: " + listaAlunos);

        listaAlunos.sort(Comparator.comparing(Aluno::getNome));
        System.out.println("\nLista ordenada por nome: " + listaAlunos);





    }
}
