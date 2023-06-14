package fundamentos.desafios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Receber a operação desejada
        // Realizar cálculo e mostrar resultado.

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input.next());
        System.out.print("Digite o segundo número: ");
        double num2 = Double.parseDouble(input.next());
        System.out.print("""
                Opções de cálculo disponíveis:
                Soma: +
                Subtração: -
                Divisão: /
                Multiplicação: *
                ------------------------------------
                Digite o símbolo de sua escolha:""");
        String operacao = input.next();
        input.close();

        double resultado = operacao.equals("+") ? num1 + num2 : 0;
        resultado = operacao.equals("-") ? num1 - num2 : resultado;
        resultado = operacao.equals("/") ? num1 / num2 : resultado;
        resultado = operacao.equals("*") ? num1 * num2 : resultado;

        System.out.println("------------------------------------");
        System.out.printf("Resultado do cálculo:\n%.2f %s %.2f = %.2f",
                num1, operacao, num2, resultado);
    }
}
