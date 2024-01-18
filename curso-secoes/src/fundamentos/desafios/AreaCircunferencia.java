package fundamentos.desafios;

import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Raio: ");
        double raio = input.nextDouble();
        final double Pi = 3.14159265359;

        // "var" deixa o java decidir o tipo da variável, nesse caso é double.
        var area = Pi * raio * raio;
        System.out.printf("\nÁrea: %.3f m².", area);
    }

}