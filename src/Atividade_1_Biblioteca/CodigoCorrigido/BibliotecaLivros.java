package Atividade_1_Biblioteca.CodigoCorrigido;

import java.util.*;
import java.util.*;

public class BibliotecaLivros {
    private static List<String> livros = new ArrayList<>(); // Persistencia em memoria
    private static Scanner sc = new Scanner(System.in);
    private static int totalEmprestimos = 0;

    public static void main(String[] args) {
        System.out.println("=== BIBLIOTECA ORGANIZADA ===");

        while (true) {
            System.out.println("\n1-Adicionar 2-Emprestar 3-Listar 4-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) { //Validação para adicionar um livro.
                System.out.print("Titulo: ");
                String titulo = sc.nextLine().trim();
                if (titulo.length() < 3) {
                    System.out.println("ERRO: Título curto!");
                    continue;
                }

                boolean existe = false;
                for (String livro : livros) {
                    if (livro.equalsIgnoreCase(titulo)) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("Livro ja existe!");
                } else {
                    livros.add(titulo);
                    System.out.println("Adicionado!");
                }

            } else if (op == 2) { //Validação para empréstimo de livro.
                if(livros.isEmpty()) {
                    System.out.println("Nenhum livro disponivel para emprestimo!");
                    continue;
                }else{
                    System.out.print("Título para emprestimo: ");
                    String tituloEmprestimo = sc.nextLine().trim();
                    boolean encontrado = false;
                    for (int i = 0; i < livros.size(); i++) {
                        if (livros.get(i).equalsIgnoreCase(tituloEmprestimo)) {
                            livros.remove(i);
                            totalEmprestimos++;
                            System.out.println("Emprestado! Total: " + totalEmprestimos);
                            System.out.println("Livros disponiveis: " + (livros.size()));
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Livro nao encontrado!");
                }


            } else if (op == 3) { //Apresenta os livros adicionados.
                if(livros.isEmpty()) {
                    System.out.println("Nenhum livro disponivel!");
                    continue;
                }
                System.out.println("Livros disponíveis (" + livros.size() + "):");
                for (String l : livros) {
                    System.out.println("- " + l);
                }


            } else if (op == 4) {// Finaliza o sistema.
                sc.close();
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
