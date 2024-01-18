package fundamentos_01.exerciciosFinais;

import java.util.Scanner;

/**
 * Essa classe lê a base e altura de um triângulo e calcula sua área.
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class CalcularArea {
    public static void main(String[] args) {

        // Recebe os valores da base(b) e altura(h) de um triângulo.
        Scanner input = new Scanner(System.in);
        System.out.print("Base do triângulo: ");
        double b = input.nextDouble();
        System.out.print("Altura do triângulo: ");
        double h = input.nextDouble();
        input.close();

        // Calcula e mostra o resultado
        final double Area = b * h / 2;
        System.out.printf("\nA área do triângulo é: %.2f (m² ou cm²)", Area);
    }
}
