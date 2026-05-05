package br.com.projeto.util;
import br.com.projeto.model.Produto;
import br.com.projeto.service.BuscaBinaria;

public class Util {

    public static void listarProdutos(Produto[] lista) {
        if (lista[0] == null) {
            System.out.println("Lista de produtos vazia");
        }
        for (int i = 0; i < lista.length && lista[i] != null; i++) {
            System.out.printf("Produto [%d]: %s valor R$ %.2f\n",lista[i].getId(),lista[i].getNome(),lista[i].getPreco());
        }
    }

    public static void adicionarProdutos(Produto p, Produto[] lista) throws Exception {
        Produto produtoExiste = BuscaBinaria.BuscaBinaria(lista, p.getId());
        if (produtoExiste != null) {
            if (produtoExiste.getId() == p.getId()) {
                throw new Exception("Id não pode ser repetida");
            }
        }
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = p;
                System.out.printf("Produto %s adicionado no índíce %d no vetor%n", p.getNome(), i);
                break;
            }
        }

    }

}
