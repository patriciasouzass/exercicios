package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
    public static void main(String[] args) {

        Carro c1 = new Carro("Preto", 57.000, true);
        Carro c2 = new Carro("Vermelho", 55.000, false);
        Carro c3 = new Carro("Azul", 69.000, false);
        Carro c4 = new Carro("Preto", 56.000, true);
        Carro c5 = new Carro("Preto", 45.000, false);
        Carro c6 = new Carro("Preto", 53.000, true);

        List<Carro> carroList = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Carro> barato = carro -> carro.preco <= 55.000;
        Predicate<Carro> cor = carro -> carro.cor == "Preto";

        Function<Carro, String> mensagem = c -> "Os carros mais baratos sao os de cor " + c.cor + " e preço " + c.preco;

        carroList.stream()
                .filter(barato)
                .filter(cor)
                .map(mensagem)
                .forEach(System.out::println);

    }
}
