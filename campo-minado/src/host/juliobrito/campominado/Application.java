package host.juliobrito.campominado;

import host.juliobrito.campominado.model.Tabuleiro;
import host.juliobrito.campominado.view.TabuleiroTerminal;

public class Application {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroTerminal(tabuleiro);

    }
}
