package com.projeto.pizzaria;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private List<Produto> produtos;
    private List<Bebida> bebidas;

    public Carrinho() {
        this.produtos = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarItem(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void exibirItens() {
        if (produtos.isEmpty() && bebidas.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto produto : produtos) {
                System.out.println("- Produto: " + produto.getNome() + " Preço " + produto.getPreco());
            }
            for (Bebida bebida : bebidas) {
                System.out.println("- Bebida: " + bebida.getNome() + " Preço " + bebida.getPreco());
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        for (Bebida bebida : bebidas) {
            total += bebida.getPreco();
        }
        return total;
    }

    public void exibirTotal() {
        double total = calcularTotal();
        System.out.println("Total a pagar: " + total);
    }
}

