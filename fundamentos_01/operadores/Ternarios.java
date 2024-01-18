package fundamentos_01.operadores;

public class Ternarios {
    public static void main(String[] args) {
        double media = 8.6;
        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado!" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && nota >= 7;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("Tem desconto? %s", resultado);
    }
}
