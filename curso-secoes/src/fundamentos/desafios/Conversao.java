package fundamentos.desafios;

import javax.swing.*;

public class Conversao {
    public static void main(String[] args) {
        String valor3 = JOptionPane.showInputDialog("Antepenúltimo salário: ");
        String valor2 = JOptionPane.showInputDialog("Penúltimo salário: ");
        String valor1 = JOptionPane.showInputDialog("Último salário: ");

        Double salario1 =  Double.parseDouble(valor1.replace(",", "."));
        Double salario2 = Double.parseDouble(valor2.replace(",", "."));
        Double salario3 = Double.parseDouble(valor3.replace(",", "."));

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.printf("A sua média salarial é: R$%.2f", media);

    }
}
