package fundamentos;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // E
        System.out.println(condicao1 || condicao2); // OR
        System.out.println(condicao1 ^ condicao2); // XOR
        System.out.println(!condicao1); // NÃO
        System.out.println(!condicao2); // NÃO
    }
}
