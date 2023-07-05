package classe.desafioFinal;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("maçã", 0.130);
        Comida c2 = new Comida("manga", 0.110);
        Comida c3 = new Comida("melancia", 0.896);
        Comida c4 = new Comida("melão", 0.762);

        Pessoa p1 = new Pessoa("julio", 55.0);
        Pessoa p2 = new Pessoa("João", 32);
        Pessoa user;

        String continuar;
        int escolha;
        Scanner input = new Scanner(System.in);

        System.out.printf("""
                Primeira pessoa: %s   - Peso: %.2f
                Segunda pessoa: %s   -  Peso: %.2f
                """, p1.nomePessoa, p1.pesoPessoa, p2.nomePessoa, p2.pesoPessoa);

        while (true) {
            getSeparador();
            System.out.printf("Você é %s? Digite 1!\nVocê é %s? Digite 2!\n", p1.nomePessoa, p2.nomePessoa);
            System.out.print("Quem você é? ");
            int usuario = Integer.parseInt(input.nextLine());

            if (usuario != 1 && usuario != 2) {
                continue;
            }

            if (usuario == 1) {
                user = p1;
            } else {
                user = p2;
            }

            getSeparador();
            do {
                System.out.printf("""
                        Opções de comida: \n1 - %s
                        2 - %s
                        3 - %s
                        4 - %s
                        Digite a opção escolhida:\s""", c1.nomeComida, c2.nomeComida, c3.nomeComida, c4.nomeComida);
                escolha = Integer.parseInt(input.nextLine());
                switch (escolha) {
                    case 1 -> user.comer(c1);
                    case 2 -> user.comer(c2);
                    case 3 -> user.comer(c3);
                    case 4 -> user.comer(c4);
                    default -> System.out.println("Opção inválida! Digite de 1 a 4!");
                }
            } while (escolha < 1 || escolha > 4);

            getSeparador();
            System.out.printf("%s agora pesa %.2fKg.\n", user.nomePessoa, user.pesoPessoa);

            do {
                System.out.print("Deseja continuar? [S/n]: ");
                continuar = input.nextLine().toUpperCase();
            } while (!continuar.equals("S") && !continuar.equals("N"));

            if (continuar.equals("N")) {
                break;
            }
        }
    }
    static void getSeparador () {
        System.out.println("#####################################");
    }
}
