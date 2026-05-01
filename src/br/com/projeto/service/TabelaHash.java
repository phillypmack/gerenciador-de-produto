package br.com.projeto.service;

public class TabelaHash {
    private ListaEncadeada[] tabela;
    private int tamanho;
    private final int vazio = -1;


    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new ListaEncadeada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    public int funcaoHash(int chave) {
        return chave % tamanho;
    }

    public void inserirFinal(int chave) {
        int indice = funcaoHash(chave);
        tabela[indice].inserirFinal(chave);
        System.out.printf("Chave %d inserida no índice %d%n ", chave, indice);
    }

    public void buscar(int chave) {
        int indice = funcaoHash(chave);
        if (tabela[indice].buscar(chave)) {
            System.out.printf("Chave %d encontrada no índice %d%n", chave, indice);
        } else {
            System.out.printf("Chave %d não encontrada.%n", chave);
        }
    }
}