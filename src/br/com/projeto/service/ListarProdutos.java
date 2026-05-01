package br.com.projeto.service;

import br.com.projeto.util.*;
import br.com.projeto.model.Produto;

public class ListarProdutos {


    public static void listarProdutos(Produto[] lista) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                System.out.println("vazio");
            } else {
                Imprimir.imprimirProduto(lista[i]);

            }
        }
    }
}
