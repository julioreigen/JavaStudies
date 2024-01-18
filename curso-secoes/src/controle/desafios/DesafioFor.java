package controle.desafios;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (;;) {
            if (!"######".equals(valor)) {
                System.out.println(valor);
                valor += "#";
            } else {
                break;
            }
        }

        // Desafio:
        // Não pode usar valor numérico para controlar o laço!

        // O código poderia ter ficado assim:
        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
