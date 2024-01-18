package controle.ExerciciosFinais;

import java.util.Scanner;

// Recebe um número e diz se ele é um número primo. (SWITCH)
public class PrimoSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        String continuar = "S";
        do {
            System.out.print("Digite um número: ");
            numero = Integer.parseInt(input.nextLine());
            // Encontra os múltiplos do número e armazena em mult.
            int mult = 0;
            for (int i = 2; i < numero; i++) {
                switch (numero % i) {
                    case 0:
                        mult++;
                }
            }
            // Informa se o número é primo.
            switch (mult) {
                case 0:
                    System.out.println("Este número é primo!");
                    break;
                default:
                    System.out.println("Este não é um número primo!");
            }
            // Recebe apenas S ou N como resposta para continuar ou encerrar o programa.
            do {
                System.out.print("Deseja digitar outro número? [S/n]: ");
                continuar = input.nextLine();
            } while (!"S".equalsIgnoreCase(continuar) && !"N".equalsIgnoreCase(continuar));

        } while (continuar.equalsIgnoreCase("S"));

        input.close();
    }
}
