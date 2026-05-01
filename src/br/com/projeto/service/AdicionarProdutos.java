package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class AdicionarProdutos {

    public static void adicionarProdutos(int id, String nome, double preco, Produto[] lista) {
        Produto produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);

        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = produto;
                break;
            }
        }

    }
}
