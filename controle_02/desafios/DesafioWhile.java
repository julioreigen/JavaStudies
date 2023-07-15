package controle_02.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.print("ESCOLA JOAO PEDRO".indent(3));
        System.out.println("=======================");
        double nota = 0;
        double total = 0;
        int qnt = 0;

        Scanner input = new Scanner(System.in);
        while (nota != -1){
            System.out.print("Digite uma nota (-1 encerra.): ");
            nota = input.nextDouble();
            if (nota >= 0 && nota <= 10) {
                total += nota;
                qnt ++; }
            else if (nota != -1){
                System.out.println("Nota inválida! Digite de 0 a 10!");
            }
        }
        input.close();
        double media = total / qnt;
        System.out.printf("Sua média foi: %.2f", media);
    }
}
