package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Carla"));
        usuarios.add(new Usuario("Carlos"));

        boolean resultado = usuarios.contains(new Usuario("Carla"));
        System.out.println(resultado);
    }
}
