package controle_02.ExerciciosFinais;

import java.util.Scanner;

// recebe 10 valores e ao final imprime o maior número.
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int numero = Integer.parseInt(input.nextLine());
        int maior = numero;
        short pos = 0;

        for (int i = 2; i <= 10 ; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = Integer.parseInt(input.nextLine());
            if (numero >= maior) {
                maior = numero;
                pos = (short) i;
            }
        }
        input.close();
        System.out.printf("\nO %dº número foi o maior digitado: %d", pos, maior);
    }
}
