package br.com.projeto.service;

import br.com.projeto.model.Produto;
import br.com.projeto.util.Util;

public class ListarProdutos {

    public static void listarProdutos(Produto[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                Util.imprimirLista(lista[i]);
            }
        }
    }
}
