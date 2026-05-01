package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class BuscaSequencial {

    public static Produto buscaSequencial(Produto[] lista, int id) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getId() == id) {
                return lista[i];
            }
        }

        return null;
    }
}