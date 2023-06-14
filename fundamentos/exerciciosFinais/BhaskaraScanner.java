package fundamentos.exerciciosFinais;

import java.util.Scanner;

/**
 * Essa classe realiza cálculos de equações de segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class BhaskaraScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor de A: ");
        int a = input.nextInt();
        System.out.print("\nValor de B: ");
        int b = input.nextInt();
        System.out.print("\nValor de C: ");
        int c = input.nextInt();
        input.close();

        double delta = (Math.pow(b, 2)) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("""
                \nDelta = %.2f
                X1 = %.2f
                X2 = %.2f""", delta, x1, x2);
    }
}
