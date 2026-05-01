package br.com.projeto;

import br.com.projeto.model.Produto;
import br.com.projeto.service.AdicionarProdutos;
import br.com.projeto.service.ListarProdutos;
import br.com.projeto.service.TabelaHash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanho = 10;
        Scanner sc = new Scanner(System.in);
        Produto[] lista = new Produto[tamanho];

        AdicionarProdutos.adicionarProdutos(0,"Picanha",67.90 , lista);
        AdicionarProdutos.adicionarProdutos(1,"Arroz 5KG",35.90 , lista);
        AdicionarProdutos.adicionarProdutos(2,"Feijão",12.90 , lista);



        ListarProdutos.listarProdutos(lista);

        int selecao = -1;
        do {
            System.out.println("O sistema deve apresentar o seguinte menu:" +
                    "\n1 - Cadastrar produto" +
                    "\n2 - Listar produtos" +
                    "\n3 - Ordenar (Bubble Sort)" +
                    "\n4 - Ordenar (Selection Sort)" +
                    "\n5 - Buscar (Sequencial)" +
                    "\n6 - Buscar (binária)" +
                    "\n7 - Buscar (Hash)" +
                    "\n0 - Sair");

            switch (selecao) {
                case 1:
                    System.out.print("Digite a Id do produto: ");
                    int id = sc.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double valor = sc.nextDouble();
                    Produto produto = new Produto(id, nome, valor);


            }
        } while (selecao != 0);

        sc.close();
    }
}
