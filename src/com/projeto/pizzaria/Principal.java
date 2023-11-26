package com.projeto.pizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        List<Produto> cardapio = Cardapio.obterCardapio();
        Carrinho carrinho = new Carrinho();
        List<Bebida> bebidas = Bebida.inicializarBebidas();

        System.out.println("Seja bem vindo a Pizzaria Buon Vicino");
        Pedido pedido = new Pedido();

        while (continuar) {
            System.out.println(" - \n" +
                    "Inicio \n"  +
                    "1- Fazer pedido\n" +
                    "2- Bebidas\n" +
                    "3- Carrinho \n" +
                    "4- Ver cardapio\n" +
                    "5- Contados\n" +
                    "6- Sair"
            );
            int escolhaMenu = sc.nextInt();

            switch (escolhaMenu) {
                case 1:
                        pedido.FazerPedido(cardapio, carrinho); // metodo de fazer o pedido dos produtos
                    break;
                case 2:
                    pedido.FazerPedidoBebidas(bebidas , carrinho); // metodo de fazer o pedido das bebidas
                break;
                case 3:
                    carrinho.exibirItens(); // mostra os itens no carrinho
                    carrinho.exibirTotal(); // mostra o total do carrinho
                    break;

                case 4:
                    // cardapio com valores
                    System.out.println("=== Cardápio da Pizzaria ===");
                    List<Produto> cardapioPrincipal = new ArrayList<>();
                    cardapioPrincipal.add(new Produto("Pizza Margherita", 39.0));
                    cardapioPrincipal.add(new Produto("Pizza Pepperoni", 42.9));
                    cardapioPrincipal.add(new Produto("Pizza Calabresa", 39.0));
                    cardapioPrincipal.add(new Produto("Pizza Quatro Queijos", 65.0));
                    cardapioPrincipal.add(new Produto("Pizza Frango com Catupiry", 57.0));
                    cardapioPrincipal.add(new Produto("Pizza Portuguesa", 58.0));
                    cardapioPrincipal.add(new Produto("Pizza Vegetariana", 55.0));
                    cardapioPrincipal.add(new Produto("Pizza de Chocolate", 60.0));
                    cardapioPrincipal.add(new Produto("Pizza de Banana com Canela", 60.0));
                    for (int i = 0; i < cardapioPrincipal.size(); i++) {
                        Produto produto = cardapioPrincipal.get(i);
                        System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
                    }
                    System.out.println("=== Fim do Cardápio ===");
                    break;
                case 5:
                    // contatos da pizzaria
                    String contatos = ("Contatos\n" +
                            "Telefone (11) 2929-2929\n" +
                            "WhatsApp (11) 2929-2929\n" +
                            "Email pizzariabuonvicino@hotmail.com\n");
                    System.out.println(contatos);
                    break;
                case 6:
                    // verificaçao de encerramento 
                    System.out.println("Tem certeza que deseja sair? (S/N)");
                    String resposta = sc.next().toUpperCase();

                    if (resposta.equals("S")) {
                        continuar = false; // Sai e encerra o programa
                        System.out.println("== Até mais ==");
                    } else if (resposta.equals("N")) {
                        continuar = true; // volta para o menu
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    break;

            }

        }
    }
}
