package controle_02.ExerciciosFinais;

import java.util.Scanner;

/*
programa que enquanto estiver recebendo números positivos, imprime no console
a soma dos números inseridos,
caso receba um número negativo, encerre o programa.
Tente utilizar a estrutura do while.
 */
public class Positivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;
        double soma = 0;

        do {
            System.out.print("Digite um número: ");
            valor = Double.parseDouble(input.nextLine().replace(",", "."));
            if (valor < 0) {
                System.out.println("Programa encerrado!\nSoma final: " + soma);
                continue;
            }
            soma += valor;
            System.out.println("Soma dos números digitados: " + soma);
            System.out.println("===============================");
        } while (valor >= 0);

        input.close();
    }
}
