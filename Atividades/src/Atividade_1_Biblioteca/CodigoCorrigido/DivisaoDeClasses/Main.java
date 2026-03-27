package Atividade_1_Biblioteca.CodigoCorrigido.DivisaoDeClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("=== BIBLIOTECA DE LIVROS ===");

        while (true) {
            System.out.println("\n1-Adicionar 2-Emprestar 3-Listar 4-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: //Validação para adicionar um livro.
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    if(titulo.trim().length() < 3) {
                        System.out.println("ERRO: Título curto!");
                        continue;
                    }
                    else if(biblioteca.adicionarLivro(titulo)) {
                        System.out.println("Adicionado!");
                    } else {
                        System.out.println("Erro ao adicionar livro, há um livro com o mesmo nome!");
                    }
                    break;

                case 2: //Validação para emprestar um livro.
                    if (biblioteca.getQuantidadeLivros() == 0) {
                        System.out.println("Nenhum livro disponível!");
                        break;
                    }
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    if (biblioteca.emprestarLivro(titulo)) {
                        System.out.println("Emprestado!");
                        System.out.println("Total emprestimos: " +
                                biblioteca.getTotalEmprestimos());
                    } else
                        System.out.println("Livro nao encontrado!");
                    break;

                case 3: //Apresenta todos os livros da lista.
                    if (biblioteca.getQuantidadeLivros() == 0) {
                        System.out.println("Nenhum livro na lista!");
                        break;
                    }
                    System.out.println("Livros:");
                    for (Livro livro : biblioteca.listarLivros())
                        System.out.println("- " + livro);
                    break;

                case 4: //Finaliza o programa.
                    sc.close();
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
