package br.com.projeto.service;

import br.com.projeto.model.Produto;
import java.util.ArrayList;

public class AdiconarProdutos {

    private Produto produto;

    public static void adicionarProdutos( int id, String nome, double preco, Produto[] lista) {
        Produto produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);

    }
}
