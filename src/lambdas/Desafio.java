package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        /*
        1 - a partir do produto, calcular o preço real (com desconto)
        2 - imposto municipal >= 2500 (8.5%) e < 2500 (isento)
        3 - frete >= 3000 (100) e < 3000 (50)
        4 - arredondar para duas casas decimais
        5 - formatar R$1234,56
        */

//        BinaryOperator<Double> desconto =
//                (v1, v2) -> v1 * (1 - v2);
//        System.out.println(desconto.apply(3499.99, 0.15));
//
//        Function<Double, String> imposto = n1 -> {
//            double valorFinal = ((n1 >= 2500) ? n1 * (1 + 0.85) : n1);
//            return valorFinal >= 2500.00 ? "Recebe taxa de 8.5%" : "Isento";
//        };
//
//        BinaryOperator<Double> valorImposto =
//                (v1, v2) -> ((v1 >= 2500) ? v1 * (1 + 0.085) : v1);
//
//
//        UnaryOperator<Double> valorFrete = v1 -> {
//            double resultado = ((v1 >= 3000) ? (v1 = v1 + 100) : (v1 = v1 + 50));
//            return resultado;
//        };
//
////        Function<Double, String> imposto = n1 -> {
////            double valorFinal = ((n1 >= 2500) ? n1 * (1 + 0.85) : n1);
////            return valorFinal >= 2500.00 ? "Recebe taxa de 8.5%" : "Isento";
////        };
//
//        System.out.println(valorFrete.apply(3499.99));
//
//        System.out.println(valorImposto.apply(3499.99, 0.15));
//
//        System.out.println(imposto.apply(3499.99));

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");


        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = (precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p));
        System.out.println("O preço final é " + preco);
    }
}
