package com.projeto.pizzaria;

import java.util.Scanner;

public class Pedido {
    public void FazerPedido(String[] cardapio, Carrinho carrinho) {
        System.out.println("=== Cardápio da Pizzaria ===");
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println((i + 1) + ". " + cardapio[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o número da pizza que deseja adicionar ao carrinho: ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= cardapio.length) {
            String pizzaEscolhida = cardapio[escolha - 1];
            carrinho.adicionarItem(pizzaEscolhida);
            System.out.println("Você escolheu a pizza: " + cardapio[escolha - 1] + ". Adicionada ao carrinho!");
        } else {
            System.out.println("Opção inválida. Por favor, escolha um número de pizza válido.");
        }
    }
}
