package controle.ExerciciosFinais;

import java.time.LocalDate;

// informa se o ano atual é um ano bissexto;
public class Bissexto {
    public static void main(String[] args) {
        int ano = LocalDate.now().getYear();
        if (ano % 4 == 0 || (ano % 100 == 0 && ano % 400 == 0)) {
            System.out.printf("%s é um ano bissexto!", ano);
        } else {
            System.out.printf("%s não é um ano bissexto!", ano);
        }
    }
}
