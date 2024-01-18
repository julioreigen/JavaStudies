package arrays_04;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double total_A = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total_A += notasAlunoA[i];
        }
        System.out.println(total_A / notasAlunoA.length);

        double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double total_B = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total_B += notasAlunoB[i];
        }
        System.out.println(total_B / notasAlunoB.length);
    }
}
