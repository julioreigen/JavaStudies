package controle.ExerciciosFinais;

import java.util.Scanner;

// recebe um número e verifica se ele está entre 0 e 10 e é par;
public class Par {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String continuar;

        do {
            System.out.print("Digite um número: ");
            numero = Integer.parseInt(input.nextLine());
            if (numero > 0 && numero < 10) {
                System.out.print("Este número está entre 0 e 10 e ");
            } else {
                System.out.print("Este número não está entre 0 e 10 e ");
            }
            if (numero % 2 == 0) {
                System.out.println("é par!");
            } else {
                System.out.println("é ímpar!");
            }
            do {
                System.out.print("Deseja continuar com outro número? [S/n]: ");
                continuar = input.nextLine();
            } while (!"S".equalsIgnoreCase(continuar) && !"N".equalsIgnoreCase(continuar));

        } while (continuar.equalsIgnoreCase("S"));

        input.close();
        System.out.println("Programa encerrado. Até logo!");
    }
}
