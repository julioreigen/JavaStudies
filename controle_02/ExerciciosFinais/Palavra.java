package controle_02.ExerciciosFinais;

import java.util.Scanner;

// Recebe uma palavra e imprime letra por letra.
public class Palavra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        for (int i = 0; i < palavra.length(); i++) {
            System.out.printf("%s  ", palavra.charAt(i));
        }
        input.close();
    }
}
