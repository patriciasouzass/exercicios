package oo.composicao.desafio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> listaCompra = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    Double obterValorTotal(Compra compra) {
        double valorTotal = 0;

        valorTotal += compra.obterValorTotal();

        DecimalFormat formato = new DecimalFormat("#.##");
        valorTotal = Double.valueOf(formato.format(valorTotal));

        return valorTotal;
    }
}
