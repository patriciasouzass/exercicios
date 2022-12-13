package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.nomeCliente = "Joao Pedro";

        c1.adicionarItem("Celular", 1, 900);
        c1.adicionarItem(new Item("Caneta", 20, 10));
        c1.adicionarItem(new Item("Borraca", 12, 3.99));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

        // somente para mostrar relaçao bidirecional
        double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O valor total é R$ " + total);

    }
}
