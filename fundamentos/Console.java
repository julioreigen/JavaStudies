package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = ler.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.printf("\nNome: %s %s\nIdade: %d", nome, sobrenome, idade);

        ler.close();
    }
}
