package fundamentos.exerciciosFinais;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Essa classe lê a temperatura em Fahrenheit e converte para Celsius
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        double tempF = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ºF: "));
        Double tempC = (tempF - 32) * (5/9.0);
        DecimalFormat formatado = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "Temperatura em ºC: "+formatado.format(tempC), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Execução concluída!");
    }
}
