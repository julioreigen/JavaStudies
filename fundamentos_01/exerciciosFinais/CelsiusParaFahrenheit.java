package fundamentos_01.exerciciosFinais;

import javax.swing.*;

/**
 * Essa classe lê a temperatura em Celsius e converte para Fahrenheit
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        double tempC = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ºC: "));
        double tempF = (tempC * 1.8) + 32;
        JOptionPane.showMessageDialog(null, (String.format("Temperatura em ºF: %.2f", tempF)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Execução concluída");
    }
}
