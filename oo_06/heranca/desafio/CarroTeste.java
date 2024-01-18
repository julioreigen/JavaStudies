package oo_06.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro civic = new Civic();

        System.out.println("Civic:");
        System.out.println(civic);
        civic.acelerar();
        System.out.println(civic);
        civic.acelerar();
        System.out.println(civic);
        civic.acelerar();
        System.out.println(civic);
        civic.frear();
        System.out.println(civic);
        civic.frear();
        System.out.println(civic);


        Ferrari ferrari = new Ferrari(400);
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();

        System.out.println("\nFerrari:");
        System.out.println(ferrari);
        System.out.println(ferrari.velocidadeDoAr());
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
    }
}
