package arrays.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws IOException {
        double soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas notas deseja informar? ");
        int qntd_notas = Integer.parseInt(input.nextLine());
        double[] notas = new double[qntd_notas];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dª nota: ", i + 1);
            notas[i] = Double.parseDouble(input.nextLine().replace(",", "."));
            soma += notas[i];
        }
        input.close();

        double media = soma / qntd_notas;
        System.out.println("BOLETIM DO ALUNO: ");
        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
        }
        System.out.printf("Média: %.2f\nSituação: %s", media, resultado(media));

    }

    static String resultado(double media) {
        if (media >= 7) return "Aprovado!";
        if (media >= 5) return "Em recuperação!";
        return "Reprovado!";
    }
}
