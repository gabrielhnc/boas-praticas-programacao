package Atividade_1_Biblioteca.CodigoCorrigido.DivisaoDeClasses;

public class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() { //Método acessor
        return titulo;
    }

    public boolean equalsIgnoreCase(String outroTitulo) { // Método para comparar dois títulos.
        return titulo.equalsIgnoreCase(outroTitulo.trim());
    }

    @Override
    public String toString() {
        return titulo;
    }
}
