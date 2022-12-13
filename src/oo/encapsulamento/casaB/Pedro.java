package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        //System.out.println(esposa.segredo);
        //System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar); // acessa direto, via herança. Caso haja tentativa de acessar via novo objeto de Ana, nao conseguirá
        System.out.println(todosSabem);
    }
}
