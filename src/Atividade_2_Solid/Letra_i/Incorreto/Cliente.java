package Atividade_2_Solid.Letra_i.Incorreto;

public class Cliente implements OperacoesLoja { // Importando todas os métodos da interface

    // Métodos vindo da interface "OperacoesLoja" que devem estar em uso pelo Cliente
    // comprar() e pagar()

    public void comprar() { // OK
        System.out.println("Guardando no carrinho...");
    }

    public void pagar() { // OK
        System.out.println("Pagando produtos...");
    }

    // Métodos que vieram junto da interface e que não fazem sentido estar
    // gerenciarEstoque(), gerarRelatorio() e atenderCliente()

    public void gerenciarEstoque() { // X
        System.out.println("ERRO...");
    }

    public void gerarRelatorio() { // X
        System.out.println("ERRO...");
    }

    public void atenderCliente() { // X
        System.out.println("ERRO...");
    }
}