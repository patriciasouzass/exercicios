package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> listaItem = new ArrayList<>();

    void adicionarItem(Produto p, int qtd){
        this.listaItem.add(new Item(qtd, p));
    }

    void adicionarItem(String nome, double preco, int qtd){
        var produto = new Produto(preco, nome);
        this.listaItem.add(new Item(qtd, produto));
    }

    Double obterValorTotal(){
        double total = 0;

        for (Item item: listaItem){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
