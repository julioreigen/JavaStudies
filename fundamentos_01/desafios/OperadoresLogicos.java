package fundamentos_01.desafios;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (deu certo? v ou f)
        // Trabalho na quinta (deu certo? v ou f)
        boolean trabalhoT = false;
        boolean trabalhoQ = true;

        boolean tv50 = trabalhoT && trabalhoQ;
        boolean tv32 = trabalhoT ^ trabalhoQ;
        boolean sorvete = trabalhoT || trabalhoQ;
        boolean saudavel = !sorvete;

        System.out.println("O trabalho na terça deu certo? " + trabalhoT);
        System.out.println("O trabalho na quinta deu certo? " + trabalhoQ);
        System.out.println("=========================================");
        System.out.println("Comprei TV de 50': " + tv50);
        System.out.println("Comprei TV de 32': " + tv32);
        System.out.println("Tomamos sorvete? " + sorvete);
        System.out.println("Nos mantemos saúdaveis? " + saudavel);

    }
}
