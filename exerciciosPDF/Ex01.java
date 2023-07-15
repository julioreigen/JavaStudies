package exerciciosPDF;

/**
 * Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
 * primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
 * reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima
 * a despesa total no trimestre e a média mensal de gastos.
 */
public class Ex01 {
    public static void main(String[] args) {
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;
        double despesa_trimestre = janeiro + fevereiro + marco;
        double media_gastos = (janeiro + fevereiro + marco) / 3;

        System.out.printf("Despesa total do trimestre: R$%.2f\nMédia de gastos mensal: R$%.2f", despesa_trimestre, media_gastos);
    }
}
