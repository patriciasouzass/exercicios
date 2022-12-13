package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Sabonete";
        p1.preco = 4.50;
        p1.desconto = 0.05;

        var p2 = new Produto("Notebook", 3500.00, 0.10);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        Produto p3 = new Produto("Macarrao", 5.59);
        System.out.println(p3.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("A média do carrinho é R$ %.2f\n", media);


        System.out.printf("Todos os produtos da loja com 25 por cento de desconto: %.2f\n", p1.precoComDesconto());
        System.out.println("Descontos variáveis de festas: " + p1.precoComDesconto(0.5));
    }
}
