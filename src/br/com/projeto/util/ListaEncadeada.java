package br.com.projeto.util;

public class ListaEncadeada {

    private No head;



    public boolean buscar(int valor) {
        No atual = head;

        while (atual != null) {
            if (atual.getDado() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
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


    public void inserirFinal(int valor) {
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
