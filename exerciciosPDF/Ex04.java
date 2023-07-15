package exerciciosPDF;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> multiplosDeTres = multiplos();
        System.out.println(multiplosDeTres);
    }

    static List<Integer> multiplos() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 3; i <= 100; i += 3) {
            if (i % 3 == 0) {
                lista.add(i);
            }
        }
        return lista;
    }
}
