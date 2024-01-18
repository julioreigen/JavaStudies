package fundamentos_01;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // true

        String s1 = new String("2");
        System.out.println("2" == s1); // false
        System.out.println("2".equals(s1)); // true

        Scanner input = new Scanner(System.in);

        String s2 = input.next(); // digita 2
        System.out.println("2" == s2.trim()); // false
        System.out.println("2".equals(s2.trim())); // true

        input.close();

    }
}
