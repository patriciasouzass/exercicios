package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Sabonete", 4.99, 0.15);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caderno", 14.99, 0.15);
        Produto p3 = new Produto("Panelas", 54.99, 0.15);
        Produto p4 = new Produto("Creme", 4.99, 0.15);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4);

        listaProdutos.forEach(imprimir);
        listaProdutos.forEach(p -> System.out.println(p.preco));
        listaProdutos.forEach(System.out::println);

    }
}
