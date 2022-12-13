package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TestDrive {
    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(400);
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.frear();

        Civic c1 = new Civic();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        System.out.println(f1);
        System.out.println(c1);

    }
}
