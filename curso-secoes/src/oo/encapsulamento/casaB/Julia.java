package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        // segredo
        // facoDentroDeCasa;
        // formaDeFalar;
        // todosSabem;

        Ana sogra = new Ana();

        // System.out.println(mae.segredo); // private
        // System.out.println(sogra.facoDentroDeCasa); // package / default
        // System.out.println(sogra.formaDeFalar); // protected
        System.out.println(sogra.todosSabem); // public
    }
}
