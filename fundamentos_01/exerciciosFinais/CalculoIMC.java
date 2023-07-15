package fundamentos_01.exerciciosFinais;

import java.util.Scanner;

/**
 * Essa classe lê o peso e altura de uma pessoa e informa o seu IMC.
 *
 * @author Julio César de Brito
 * @since JDK17.0
 */
public class CalculoIMC {
    public static void main(String[] args) {

        // Título
        System.out.println("==========================");
        System.out.print("Calculadora de IMC".indent(4));
        System.out.println("==========================");

        // Recebimento de valores
        Scanner input = new Scanner(System.in);
        System.out.print("Peso[Kg] : ");
        double peso = input.nextDouble();
        System.out.print("Altura[m]: ");
        double altura = input.nextDouble();
        input.close();

        // Resultados
        double imc = peso / (altura * altura);
        System.out.println("""
                =====================================
                TABELA IMC:                         #
                Menor que 18.5 = Magreza            #
                18.5 a 24.9    = Normal             #
                25 a 29.9      = Sobrepeso          #
                30 a 34.9      = Obesidade grau I   #
                35 a 39.9      = Obesidade grau II  #
                Maior que 40   = Obesidade grau III #""");
        System.out.println("=====================================");
        System.out.printf("Com uma altura de %.2fm e pesando %.2fKg, seu IMC é:\n%.1f Kg/m²", altura, peso, imc);
    }
}
