package classes;

public class AreaCirc {
    double raio;
    static final double PI = 3.1415926535897932384;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * raio * raio;
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
