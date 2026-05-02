package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class SelectionSort {

    public static void selectionSort(Produto[] lista){
        int n = lista.length;
        for (int i = 0; i <n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (lista[j] != null && lista[minIndex] != null) {
                    if (lista[j].getNome().compareToIgnoreCase(lista[minIndex].getNome()) < 0) {
                        minIndex = j;
                    }
                }

            }
            Produto temp = lista[i];
            lista[i]= lista[minIndex];
            lista[minIndex]= temp;
        }
    }
}