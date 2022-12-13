package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

       // Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Paulo");
        listaAprovados.add("Celina");
        listaAprovados.add("Paula");
        listaAprovados.add("Lucas");

        for (String aprovados : listaAprovados){
            System.out.println(aprovados);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(30);
        nums.add(6);

        for (int n : nums){
            System.out.println(n);
        }
    }
}
