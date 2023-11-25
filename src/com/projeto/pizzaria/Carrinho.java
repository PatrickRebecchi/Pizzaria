package com.projeto.pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<String> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (String item : itens) {
                System.out.println("- " + item);
            }
        }
    }
}
