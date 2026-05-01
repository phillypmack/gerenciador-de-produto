package br.com.projeto.util;
import br.com.projeto.model.Produto;

public class Util {

    public static void imprimirLista(Produto produto){
        System.out.printf("Produto [%d]: %s valor R$ %.2f\n",produto.getId(),produto.getNome(),produto.getPreco());
    }

}
