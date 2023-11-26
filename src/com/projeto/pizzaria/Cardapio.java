package com.projeto.pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    public static List<Produto> obterCardapio(){
        List<Produto> cardapio = new ArrayList<>();
        cardapio.add(new Produto("Pizza Margherita", 39.0));
        cardapio.add(new Produto("Pizza Pepperoni", 42.9));
        cardapio.add(new Produto("Pizza Calabresa", 39.0));
        cardapio.add(new Produto("Pizza Quatro Queijos", 65.0));
        cardapio.add(new Produto("Pizza Frango com Catupiry", 57.0));
        cardapio.add(new Produto("Pizza Portuguesa", 58.0));
        cardapio.add(new Produto("Pizza Vegetariana", 55.0));
        cardapio.add(new Produto("Pizza de Chocolate", 60.0));
        cardapio.add(new Produto("Pizza de Banana com Canela", 60.0));
        return cardapio;
    }

}
