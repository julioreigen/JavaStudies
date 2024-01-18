package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class InterfaceCarro {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari();
        Carro civic = new Civic();

        System.out.println("Carro desligado.");
        System.out.printf("Velocidade atual de Ferrari: %dfKm/h\n", ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual de Civic: %dKm/h\n", civic.velocidadeAtual);


        ferrari.acelerar();
        civic.acelerar();
        System.out.printf("\nVelocidade atual de Ferrari: %dKm/h\n", ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual de Civic: %dKm/h\n", civic.velocidadeAtual);

        ferrari.acelerar();
        civic.acelerar();
        System.out.printf("\nVelocidade atual de Ferrari: %dKm/h\n", ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual de Civic: %dKm/h\n", civic.velocidadeAtual);

        ferrari.frear();
        civic.frear();
        System.out.printf("\nVelocidade atual de Ferrari: %dKm/h\n", ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual de Civic: %dKm/h\n", civic.velocidadeAtual);

        ferrari.frear();
        System.out.printf("\nVelocidade atual de Ferrari: %dKm/h\n", ferrari.velocidadeAtual);
        System.out.printf("Velocidade atual de Civic: %dKm/h\n", civic.velocidadeAtual);
    }
}
