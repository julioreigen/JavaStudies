package controle_02;

public class For3 {
    public static void main(String[] args) {
        // Caso 1
//        int i = 0; // É necessário colocar a variável fora do laço para utilizar ela depois.
//        for (; i < 10 ; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);

        // Caso 2
//        for (int c = 0; c < 10 ; c++) {
//            System.out.println(c);
//        }
//        int c = 0; // É possível declarar uma variável global com o mesmo nome da variável local do for.
//        System.out.println(c);

        // Caso 3
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.printf("[%d %d]", a, b);
            }
            System.out.println();
        }
    }
}
