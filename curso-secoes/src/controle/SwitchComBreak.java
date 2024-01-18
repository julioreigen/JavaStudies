package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = input.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6, 5:
                conceito = "C";
                break;
            case 4, 3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "E";
                break;
            default:
                conceito = "não encontrado!";
        }
        System.out.println("Conceito é: " + conceito);

        // O switch acima pode ser feito da seguinte forma(melhorado):
        System.out.print("\nNota novamente:");
        nota = input.nextInt();

        conceito = switch (nota) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1, 0 -> "E";
            default -> "não encontrado!";
        };
        System.out.println("Conceito: " + conceito);
        input.close();
    }
}
