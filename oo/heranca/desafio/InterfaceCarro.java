package oo.heranca.desafio;

public class InterfaceCarro {
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
