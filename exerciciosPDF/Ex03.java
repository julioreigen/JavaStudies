package exerciciosPDF;

public class Ex03 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d + %d = %d\n", i, soma, soma + i);
            soma += i;
        }
    }
}
