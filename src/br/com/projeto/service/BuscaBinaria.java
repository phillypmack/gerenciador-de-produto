package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class BuscaBinaria {

    public static Produto BuscaBinaria(Produto[] lista, int id) {
        int inicio = 0;
        int fim = lista.length - 1;
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            fim = i;
        }

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

                if (lista[meio].getId() == id) {
                    return lista[meio];
                }

                if (lista[meio].getId() < id) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }

        }

        return null;
    }
}