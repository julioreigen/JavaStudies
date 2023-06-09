package fundamentos.desafios;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // (Fº - 32) * 5/9 = Cº
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a temperatura em ºF: ");
        final double Fahrenheit = ler.nextDouble();
        final double Celsius = (Fahrenheit - 32) * 5.0/9.0;
        System.out.printf("%.1fºF convertido em Celsius é: %.1fºC", Fahrenheit, Celsius);
    }
}
