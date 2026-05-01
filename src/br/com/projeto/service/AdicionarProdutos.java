package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class AdicionarProdutos {

    public static void adicionarProdutos(Produto p, Produto[] lista) {


        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = p;
                break;
            }
        }

    }
}
