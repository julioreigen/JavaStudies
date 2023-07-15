package controle_02;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto = "sair";

        do {
            System.out.print("Digite algo: ");
            texto = input.nextLine();
        } while (!"sair".equalsIgnoreCase(texto.trim()));

        input.close();
        System.out.println("Até logo!");
    }
}
