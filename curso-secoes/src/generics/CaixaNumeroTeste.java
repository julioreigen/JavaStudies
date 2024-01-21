package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(3.1415);
        System.out.println(caixaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(31415);
        System.out.println(caixaB);

    }
}
