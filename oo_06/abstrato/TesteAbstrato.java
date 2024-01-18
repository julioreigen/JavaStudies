package oo_06.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.mover()); // método em animal
        System.out.println(a.respirar()); // método em animal

        Mamifero b = new Cachorro();
        System.out.println(b.mamar()); // Método em mamífero
    }
}
