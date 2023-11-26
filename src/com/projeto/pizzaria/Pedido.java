package com.projeto.pizzaria;

import java.util.List;
import java.util.Scanner;

public class Pedido {
        public void FazerPedido(List<Produto> cardapio, Carrinho carrinho) {
            System.out.println("=== Cardápio da Pizzaria ===");
            for (int i = 0; i < cardapio.size(); i++) {
                System.out.println((i + 1) + ". " + cardapio.get(i).getNome() +
                        " - R$" + cardapio.get(i).getPreco());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha o número do sabor de pizza que deseja adicionar ao carrinho: ");
            int escolha = scanner.nextInt();


            if (escolha > 0 && escolha <= cardapio.size()) {
                Produto pizzaEscolhida = cardapio.get(escolha - 1);
                carrinho.adicionarItem(pizzaEscolhida);
                System.out.println("Você escolheu: " + pizzaEscolhida.getNome() + ". Adicionada ao carrinho!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha um número de sabor válido.");
            }
    }
    public void FazerPedidoBebidas(List<Bebida> bebidas, Carrinho carrinho){
            System.out.println("=== Bebidas ===");
            for (int i = 0; i < bebidas.size(); i++){
                System.out.println((i + 1) + ". " + bebidas.get(i).getNome() +
                        " - R$" + bebidas.get(i).getPreco());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha a bebida que deseja adicionar ao carrinho: ");
            int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= bebidas.size()) {
            Bebida bebidaEscolhida = bebidas.get(escolha - 1);
            carrinho.adicionarItem(bebidaEscolhida);
            System.out.println("Você escolheu: " + bebidaEscolhida.getNome() + ". Adicionada ao carrinho!");
        } else {
            System.out.println("Opção inválida. Por favor, escolha um número de bebida válido.");
        }

    }
    public static double calcularTotal(List<Produto> itensSelecionados) {
        double total = 0.0;
        for (Produto produto : itensSelecionados) {
            total += produto.getPreco();
        }
        return total;
    }
}
