package oo_06.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){

        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear(){
        if (velocidadeAtual <= 5) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= 5;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "A velocidade atual é: " + velocidadeAtual + "Km/h.";
    }
}
