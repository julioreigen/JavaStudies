package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
         int a = 97;
         int b = 'a';

        System.out.println(b == a);

        if (a == b){
            System.out.println("OKAY");
        }

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && nota >= 7;

        System.out.println("Tem desconto? " + temDesconto);


    }
}
