package oo.composicao.desafio;

import java.util.Locale;

public class ComprasTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caderno", 10, 2);
        compra1.adicionarItem(new Produto(50.98, "Mochila"), 2);

        Cliente cliente1 = new Cliente("Márcia");
        cliente1.listaCompra.add(compra1);
        System.out.println(cliente1.obterValorTotal(compra1));
    }
}
