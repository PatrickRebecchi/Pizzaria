package com.projeto.pizzaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String[] cardapio = Cardapio.obterCardapio();
        Carrinho carrinho = new Carrinho();

        System.out.println("Seja bem vindo a Pizzaria Buon Vicino");
        Pedido pedido = new Pedido();

        while (continuar) {
            System.out.println(" - \n" +
                    "Inicio \n"  +
                    "1- Fazer pedido\n2" +
                    "- Carrinho \n3" +
                    "- Ver cardapio\n4" +
                    "- Ver pedidos\n5" +
                    "- Contados\n6- Sair"
            );
            int escolhaMenu = sc.nextInt();

            switch (escolhaMenu) {
                case 1:
                    pedido.FazerPedido(cardapio, carrinho);
                    break;

                case 2:
                    carrinho.exibirItens();
                    break;

                case 3:
                    System.out.println("=== Cardápio da Pizzaria ===");
                    for (int i = 0; i < cardapio.length; i++) {
                        System.out.println((i + 1) + ". " + cardapio[i]);

                    }
                    System.out.println("=== Fim do Cardápio ===");
                    break;
            }

        }
    }
}
