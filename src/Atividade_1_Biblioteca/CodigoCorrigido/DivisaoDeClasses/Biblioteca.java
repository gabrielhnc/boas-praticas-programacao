package Atividade_1_Biblioteca.CodigoCorrigido.DivisaoDeClasses;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private int totalEmprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        totalEmprestimos = 0;
    }

    public boolean adicionarLivro(String titulo) { // Validação de criação de livro.
        if (titulo == null || titulo.trim().length() < 3)
            return false;
        for (Livro livro : livros) {
            if (livro.equalsIgnoreCase(titulo))
                return false;
        }
        livros.add(new Livro(titulo));
        return true;
    }

    public boolean emprestarLivro(String titulo) { // Validação para empréstimo de livro.
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).equalsIgnoreCase(titulo)) {
                livros.remove(i);
                totalEmprestimos++;
                return true;
            }
        }
        return false;
    }

    public List<Livro> listarLivros() { //Apresenta todos os livros.
        return livros;
    }

    public int getTotalEmprestimos() { //Apresenta a quantidade de empréstimos.
        return totalEmprestimos;
    }

    public int getQuantidadeLivros() { //Apresenta a quantidade de livros.
        return livros.size();
    }
}
