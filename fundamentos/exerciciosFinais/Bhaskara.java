package fundamentos.exerciciosFinais;

/**
 * Essa classe realiza cálculos de equações de segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class Bhaskara {
    public static void main(String[] args) {
        // Neste programa o exemplo usado será: a = 1, b = 12 e c = -13.
        // x = (-b ± √Δ) / (2a)
        // delta =  b² - 4ac

        int a = 1;
        int b = 12;
        int c = -13;

        double delta = (Math.pow(b, 2)) - 4*a*c;            // b² - 4ac
        double x1 = (-b + (Math.sqrt(delta))) / 2*a;  // (- b + √Δ) / 2a  (pode ser feito Δ^0.5)
        double x2 = (-b - (Math.sqrt(delta))) / 2*a;  // (- b - √Δ) / 2a  (pode ser feito Δ^0.5)

        System.out.printf("Resultado da equação:\nDelta: %.1f\nX1 = %.1f\nX2: %.1f", delta, x1, x2);

    }
}
