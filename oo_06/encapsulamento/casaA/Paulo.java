package oo_06.encapsulamento.casaA;

public class Paulo {

    void testeAcessos() {
        Ana esposa = new Ana();

        // System.out.println(esposa.segredo); // private
        System.out.println(esposa.facoDentroDeCasa); // package / default
        System.out.println(esposa.formaDeFalar); // protected
        System.out.println(esposa.todosSabem); // public
    }
}
