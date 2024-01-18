package lambdas_07;

@FunctionalInterface
public interface Calculo {
    // 1 método abstrato
    double executar(double a, double b);

    // 2 métodos, 1 default e 1 static
    default String legal() { return "legal"; }
    static String muitoLegal() { return "muito legal"; }
}
