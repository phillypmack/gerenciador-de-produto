package br.com.projeto.util;

import br.com.projeto.model.Produto;

public class ListaEncadeada {

    private No head;



    public Produto buscar(int id) {
        No atual = head;

        while (atual != null) {
            if (atual.getDado().getId() == id) {
                return atual.getDado();
            }
            atual = atual.getProximo();
        }

        return null;
    }
    public void consultar() {
        if (head == null) {
            System.out.println("vazio");
        } else {


            No aux = head;


            while (aux != null) {

                System.out.print(aux.getDado() + " -> ");
                aux = aux.getProximo();
            }
            System.out.println("null");
        }
    }


    public void inserir(Produto valor) {
        No novoNo = new No();
        novoNo.setDado(valor);
        novoNo.setProximo(null);

        if (head == null){
            head = novoNo;
        } else {
            No aux = head;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
        }

    }
}
