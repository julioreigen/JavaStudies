package excecao_09.personalizadaA;

import excecao_09.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", -7);
            // Validar.aluno(aluno);
            Validar.aluno(null);

        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção: " + e.getMessage());
        }

        System.out.println("Fim.");
    }
}
