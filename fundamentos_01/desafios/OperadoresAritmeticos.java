package fundamentos_01.desafios;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        Desafio: resultar em 125
        Cálculos do código: '/desafioAritmetica.png'
         */
        double a = Math.pow(6 * (3+2), 2) / (3.0 * 2);
        double b = Math.pow(((1-5) * (2-7)) / 2.0, 2);
        double res = (Math.pow(a - b, 3)) / Math.pow(10, 3);
        System.out.println(res);
    }
}
