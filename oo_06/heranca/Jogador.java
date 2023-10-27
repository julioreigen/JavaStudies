package oo_06.heranca;

public class Jogador {

    public int vida = 100;
    public int x;
    public int y;

    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente) {
        int difX = Math.abs(x - oponente.x);
        int difY = Math.abs(y - oponente.y);

        if(difX == 0 && difY == 1) {
            oponente.vida -= 10;
            return true;
        }
        if (difX == 1 && difY == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
