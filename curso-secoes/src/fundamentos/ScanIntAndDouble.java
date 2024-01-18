package fundamentos;

import java.util.Scanner;

public class ScanIntAndDouble {
    /*
    Este código possui métodos que previnem um bug de acontecer ao utilizar nextInt e nextDouble
    O erro é o seguinte:
    Ao utilizar um destes métodos, durante a execução, uma linha (\n) será pulada,
    pois o teclado irá adicionar um "\n" ao pressionar ENTER no teclado
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        Integer idade = Integer.parseInt(teclado.nextLine());  // Método 1
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();
    }

    public static void outro(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sua idade: ");
        Double age = input.nextDouble();
        input.nextLine();  // lê o "\n" que o input.nextDouble() deixa para trás. / Método 2
        System.out.println("Qual o seu nome?");
        String name = input.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String surname = input.nextLine();

        input.close();
    }
}
