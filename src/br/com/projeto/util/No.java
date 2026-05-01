package br.com.projeto.util;

import br.com.projeto.model.Produto;

public class No {

    private Produto dado;
    private No proximo;


    public Produto getDado() {
        return dado;
    }

    public void setDado(Produto dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
