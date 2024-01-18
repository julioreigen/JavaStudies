package classes.desafioFinal;

public class Comida {
    String nomeComida;
    double pesoComida;

    Comida (String nome, double peso) {
        pesoComida = peso;
        nomeComida = nome.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();
    }
}
