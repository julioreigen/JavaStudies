package lambdas_07;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        // Função que retorna a média do aluno
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 4.1));

        // #1 Função que retorna a aprovação do aluno
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 4.1));

        // #2 Função que retorna a aprovação do aluno
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
