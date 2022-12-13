package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(84.46);
        Arroz ingrediente1 = new Arroz(0.330);
        Feijao ingrediente2 = new Feijao(0.190);
        Comida ingrediente3 = new Arroz(0.300);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());

        Sorvete sobrememsa = new Sorvete(0.200);

        convidado.comer(sobrememsa);
        System.out.println(convidado.getPeso());
    }
}
