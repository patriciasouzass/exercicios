package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Produto(){

    }

    Produto(String nomeN, double precoN){
        nome = nomeN;
        preco = precoN;
    }

}
