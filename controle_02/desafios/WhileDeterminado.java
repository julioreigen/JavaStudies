package controle_02.desafios;

import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto = "";

        while (!"sair".equalsIgnoreCase(texto.trim())) {
            System.out.print("Digite algo ou 'SAIR' para encerrar: ");
            texto = input.nextLine();
        }

        input.close();
        System.out.println("Volte sempre!");
    }
}
