package Atividade_2_Solid.Letra_i.Incorreto;

public class SuperAdministrador implements OperacoesLoja{ // Importando todas os métodos da interface
    // Um super adm tem total sentido em ter acesso a todos os métodos PORÉM não é uma boa prática visto que
    // outras classes acabariam implementando métodos inúteis

    public void comprar() {
        System.out.println("Guardando no carrinho...");
    }

    public void pagar() {
        System.out.println("Pagando produtos...");
    }

    public void gerenciarEstoque() {
        System.out.println("Gerenciando o estoque...");
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório...");
    }

    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}

