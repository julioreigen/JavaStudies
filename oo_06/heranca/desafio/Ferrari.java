package oo_06.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    public Ferrari(){
        this(315);
    }
    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && ligarAr) { // Turbo e Ar ligados
            return 30;
        }
        if (ligarTurbo) { // Turbo ligado e Ar desligado
            return 35;
        }
        if (!ligarAr) { // Turbo e Ar desligados
            return 20;
        }
        return 15; // Turbo desligado e Ar ligado
    }
}
