package br.com.projeto.service;

import br.com.projeto.model.Produto;
import br.com.projeto.util.ListaEncadeada;

public class TabelaHash {
    private ListaEncadeada[] tabela;
    private int tamanho;


    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new ListaEncadeada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    public int funcaoHash(int id) {
        return id % tamanho;
    }

    public  void inserir(Produto p) throws Exception {
        Produto produtoExiste = buscar(p.getId());
        if (produtoExiste != null) {
            if (produtoExiste.getId() == p.getId()) {
                throw new Exception("Id não pode ser repetida");
            }
        }
        int indice = funcaoHash(p.getId());
        tabela[indice].inserir(p);
        System.out.printf("Produto %s inserida no índice %d na tabela hash%n", p.getNome(), indice);
    }

    public Produto buscar(int id) {
        int indice = funcaoHash(id);
        return tabela[indice].buscar(id);
    }
}