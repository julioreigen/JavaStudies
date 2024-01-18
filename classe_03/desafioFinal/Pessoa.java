package classe_03.desafioFinal;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nome, double peso) {
        nomePessoa = nome.substring(0,1).toUpperCase() + nome.substring(1);
        pesoPessoa = peso;
    }
    void comer(Comida comida) {
        if(comida != null) {
            pesoPessoa += comida.pesoComida;
        }
    }
}
