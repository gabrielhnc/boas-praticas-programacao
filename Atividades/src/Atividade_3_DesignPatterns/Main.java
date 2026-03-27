package Atividade_3_DesignPatterns;

import Atividade_3_DesignPatterns.Singleton.Conexao;
import Atividade_3_DesignPatterns.Factory.PagamentoFactory;
import Atividade_3_DesignPatterns.Model.Carrinho;
import Atividade_3_DesignPatterns.Strategy.Pagamento;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pattern SINGLETON -> Única instancia
        Conexao conexao = Conexao.getInstancia();
        conexao.conectar();

        // Criação do modelo (Carrinho)
        Carrinho carrinho = new Carrinho();

        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        System.out.println("Escolha o pagamento (pix, cartao, boleto): ");
        String tipo = sc.next();

        // Patterns FACTORY + STRATEGY
        Pagamento pagamento = PagamentoFactory.criarPagamento(tipo);
        carrinho.setTipo(pagamento);

        carrinho.finalizarCompra(valor);

        sc.close();
    }
}