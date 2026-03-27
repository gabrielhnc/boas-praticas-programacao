package Atividade_3_DesignPatterns.Singleton;

public class Conexao {
    private static Conexao instancia;

    private Conexao() {
        System.out.println("Conexão criada!");
    }

    public static Conexao getInstancia() {
        if (instancia == null) {
            instancia = new Conexao();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conexão bem sucedida!");
    }
}