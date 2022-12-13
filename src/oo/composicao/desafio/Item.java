package oo.composicao.desafio;

public class Item {
    final int quantidade;
    final Produto produto;

    Item(int quantidade, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}