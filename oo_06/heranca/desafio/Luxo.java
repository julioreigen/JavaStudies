package oo_06.heranca.desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();
    default int velocidadeDoAr() {
        return 1;
    }
}
