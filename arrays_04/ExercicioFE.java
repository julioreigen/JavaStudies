package arrays_04;

public class ExercicioFE {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        double total_A = 0;
        for (double nota : notasAlunoA) {
            total_A += nota;
        }
        System.out.println(total_A / notasAlunoA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.9, 10};
        double total_B = 0;
        for (double nota:notasAlunoB) {
            total_B += nota;
        }
        System.out.println(total_B / notasAlunoB.length);
    }
}
