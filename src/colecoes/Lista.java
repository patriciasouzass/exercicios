package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Marcos");

        lista.add(u1);
        lista.add(new Usuario("Paulo"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Paula"));

        System.out.println(lista.get(3));

        lista.remove(1);

        for (Usuario u : lista) {
            System.out.println(u);
        }
    }
}
