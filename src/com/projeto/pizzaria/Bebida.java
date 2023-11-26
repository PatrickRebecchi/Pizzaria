package com.projeto.pizzaria;
//public class Bebidas {
//    public static String[] obterBebidas() {
//        String[] bebidas = {
//                "Refrigerante 2L Coca-Cola",
//                "Refrigerante 600ml Coca-Cola",
//                "Refrigerante 350ml Coca-Cola",
//                "Refrigerante 2L Guaraná",
//                "Refrigerante 600ml Guaraná",
//                "Refrigerante 350ml Guaraná",
//                "Refrigerante 2L Sprit",
//                "Refrigerante 600ml Sprit",
//                "Refrigerante 350ml Sprit",
//                "Refrigerante 2L Pepsi",
//                "Suco de Laranja",
//                "Água Mineral com Gás",
//                "Água Mineral sem Gás",
//                "Cerveja Heineken",
//                "Cerveja Skol",
//                "Cerveja Brahma"
//        };
//        return bebidas;
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class Bebida {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setter para definir o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public static List<Bebida> inicializarBebidas() {
        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(new Bebida("Coca-Cola 2L", 12.00));
        bebidas.add(new Bebida("Coca-Cola 600ml", 7.00));
        bebidas.add(new Bebida("Coca-Cola 350ml", 5.00));
        bebidas.add(new Bebida("Guaraná 2L", 12.00));
        bebidas.add(new Bebida("Guaraná 600ml", 7.00));
        bebidas.add(new Bebida("Guaraná 350ml", 5.00));
        bebidas.add(new Bebida("Sprit 2L", 12.00));
        bebidas.add(new Bebida("Sprit 600ml", 7.00));
        bebidas.add(new Bebida("Sprit 350ml", 5.00));
        bebidas.add(new Bebida("Pepsi 2L", 12.00));
        bebidas.add(new Bebida("Suco de Laranja", 5.00));
        bebidas.add(new Bebida("Água Mineral com Gás", 2.50));
        bebidas.add(new Bebida("Água Mineral sem Gás", 2.00));
        bebidas.add(new Bebida("Cerveja Heineken", 6.00));
        bebidas.add(new Bebida("Cerveja Skol", 5.50));
        bebidas.add(new Bebida("Cerveja Brahma", 5.00));

        return bebidas;
    }
}