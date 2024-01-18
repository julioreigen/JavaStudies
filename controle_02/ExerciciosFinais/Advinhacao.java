package controle_02.ExerciciosFinais;

import java.util.Random;
import java.util.Scanner;

/*
Jogo da adivinhação:
Tentar adivinhar um número entre 0 - 100. Armazene um número aleatório em uma variável.
O Jogador tem 10 tentativas para adivinhar o número gerado.
Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
e imprima se o número inserido é maior ou menor do que o número armazenado.
 */
public class Advinhacao {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int numero;
        Random sorteio = new Random();
        int numero_aleatorio = sorteio.nextInt(101);
        System.out.println("GERANDO NÚMERO ALEATÓRIO DE 0 A 100...\n");
        Thread.sleep(1500);

        for (int i = 10; i >= 1 ; i--) {
            System.out.print("Adivinhe o número escolhido: ");
            numero = Integer.parseInt(input.nextLine());
            if (numero == numero_aleatorio) {
                System.out.println("Você acertou! Parabéns!");
                break;
            } else {
                System.out.printf("Você errou! Tentativas restantes: %d\n", i - 1);
            }
            System.out.println("\n####################################");
        }
        input.close();
        System.out.println("O número escolhido foi: " + numero_aleatorio);
    }
}
