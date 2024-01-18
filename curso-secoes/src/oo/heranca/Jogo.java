package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador heroi = new Heroi(10, 11);

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;


        System.out.println("Monstro tem => " + monstro.vida + " de vida!");
        System.out.println("Herói tem => " + heroi.vida + " de vida!");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("\nMonstro tem => " + monstro.vida + " de vida!");
        System.out.println("Herói tem => " + heroi.vida + " de vida!");
    }
}
