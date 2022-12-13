package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();

        conjunto.add(5.3); // double -> Double
        conjunto.add("Paulo"); // String (já é objeto)
        conjunto.add(true); // boolean -> Boolean
        conjunto.add(1); // int -> Integer
        conjunto.add('a'); // char -> Caracter

        System.out.println(conjunto.size());

        conjunto.add("paulo"); // diferente de Paulo

        System.out.println(conjunto.size());

        conjunto.remove("Paulo");
        conjunto.remove(1);

        System.out.println(conjunto.size());

        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains("paulo"));

        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // uniao entre 2 conjunto
        System.out.println(conjunto);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
