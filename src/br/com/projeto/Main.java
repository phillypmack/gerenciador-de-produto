package br.com.projeto;

import br.com.projeto.model.Produto;
import br.com.projeto.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanho = 10;
        Scanner sc = new Scanner(System.in);
        Produto[] vetor = new Produto[tamanho];
        TabelaHash tabelaHash = new TabelaHash(tamanho);



        ListarProdutos.listarProdutos(vetor);

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
                    double preco = sc.nextDouble();
                    Produto produto = new Produto(id, nome, preco);
                    AdicionarProdutos.adicionarProdutos(produto, vetor);
                    tabelaHash.inserir(produto);
                    break;
                case 2:
                    ListarProdutos.listarProdutos(vetor);
                    break;
                case 3:
                    BubbleSort.bubbleSort(vetor);
                    break;
                case 4:
                    SelectionSort.selectionSort(vetor);
                    break;
                case 5:
                    System.out.print("Informe a id do produto que deseja buscar: ");
                    int idBuscaSequencial = sc.nextInt();
                    BuscaSequencial.buscaSequencial(vetor, idBuscaSequencial);
                    break;
                case 6:
                    System.out.print("Informe a id do produto que deseja buscar: ");
                    int idBuscaBinaria = sc.nextInt();
                    BuscaBinaria.BuscaBinaria(vetor, idBuscaBinaria);
                    break;
                case 7:
                    System.out.print("Informe a id do produto que deseja buscar: ");
                    int idBuscaHash = sc.nextInt();
                    tabelaHash.buscar(idBuscaHash);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        } while (selecao != 0);

        sc.close();
    }
}
