package fundamentos;

public class ConversaoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.1234567899999; // explícita (CAST) PERDE DADOS
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (CAST) PERDE DADOS
        System.out.println(d);

        double e = 1.999;
        int f = (int) e; // explícita (CAST) PERDE DADOS
        System.out.println(f);

    }
}
