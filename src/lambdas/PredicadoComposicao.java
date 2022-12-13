package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = valor -> valor % 2 == 0;
        Predicate<Integer> tresDigitos = valor -> valor > 99 && valor <= 999;

        System.out.println(isPar.test(27));
        System.out.println(tresDigitos.test(945));
        System.out.println(isPar.and(tresDigitos).test(44));
        System.out.println(isPar.or(tresDigitos).test(333));
    }
}
