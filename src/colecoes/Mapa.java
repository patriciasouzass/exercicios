package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Pablo");
        usuarios.put(1, "Douglas");
        usuarios.put(2, "Patricia");
        usuarios.put(3, "Carlos");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.values()); // valores
        System.out.println(usuarios.entrySet()); // chave e valor
        System.out.println(usuarios.containsKey(5)); // saber se tem a chave x
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue(2)); // saber se tem o valor x
        System.out.println(usuarios.get(6));
        System.out.println(usuarios.get(2));

        // Percorrer trazendo somente as chaves
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        // Percorrer trazendo somente os valores
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        // Percorrer trazendo chaves e valores
        for (Map.Entry<Integer, String> chaveValor : usuarios.entrySet()) {
            System.out.println(chaveValor);
        }
    }
}
