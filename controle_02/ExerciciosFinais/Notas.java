package controle_02.ExerciciosFinais;

import java.util.Scanner;

// Criar um programa que receba duas notas parciais, calcular a média final.
// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
// Se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
// caso contrário imprime no console "Reprovado".
public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota_1 = Double.parseDouble(input.nextLine().replace(",", "."));
        System.out.print("Digite a segunda nota: ");
        double nota_2 = Double.parseDouble(input.nextLine().replace(",", "."));
        input.close();
        double media = (nota_1 + nota_2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
