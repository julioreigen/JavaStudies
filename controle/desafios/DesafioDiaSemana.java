package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // Quarta -> 4
        // Terça -> 3

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia da semana(EX: Terça): ");
        String diaNome = input.nextLine();
        input.close();

        int diaNum;

        if (diaNome.equalsIgnoreCase("domingo")) {
            diaNum = 1;
        } else if (diaNome.equalsIgnoreCase("segunda") || (diaNome.equalsIgnoreCase("segunda-feira"))) {
            diaNum = 2;
        } else if (diaNome.equalsIgnoreCase("terça") || (diaNome.equalsIgnoreCase("terça-feira"))) {
            diaNum = 3;
        } else if (diaNome.equalsIgnoreCase("quarta") || (diaNome.equalsIgnoreCase("quarta-feira"))) {
            diaNum = 4;
        } else if (diaNome.equalsIgnoreCase("quinta") || (diaNome.equalsIgnoreCase("quinta-feira"))) {
            diaNum = 5;
        } else if (diaNome.equalsIgnoreCase("sexta") || (diaNome.equalsIgnoreCase("sexta-feira"))) {
            diaNum = 6;
        } else if (diaNome.equalsIgnoreCase("sábado") || (diaNome.equalsIgnoreCase("sabado"))) {
            diaNum = 7;
        } else {
            diaNum = 0;
        }

        if (diaNum < 1 && diaNum> 7) {
            System.out.println("Este dia não é válido!");
        } else {
            System.out.printf("%s é o %dº dia da semana!", diaNome, diaNum);
        }

    }
}
