package controle_02;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a média: ");
        double media = input.nextDouble();
        input.close();

        String situacao;
        if (media >= 7.0){
            situacao = "aprovado.";
        } else if(media >= 5){
            situacao = "em recuperação.";
        } else {
            situacao = "reprovado.";
        }

        System.out.println("Você está " + situacao);
    }
}
