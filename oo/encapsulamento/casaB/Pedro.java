package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos() {
        // System.out.println(mae.segredo); // private
        // System.out.println(mae.facoDentroDeCasa); // package / default
        System.out.println(formaDeFalar); // protected
        System.out.println(todosSabem); // public
    }
}
