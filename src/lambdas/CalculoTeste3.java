package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calcular = (x, y) -> {
            return x + y;
        };
        System.out.println(calcular.apply(5.0, 3.0));

        calcular = (x, y) -> x * y;
        System.out.println(calcular.apply(5.0, 3.0));

        BinaryOperator<Integer> calcular2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calcular2.apply(5, 3));

        calcular = (x, y) -> x * y;
        System.out.println(calcular2.apply(5, 3));

    }
}
