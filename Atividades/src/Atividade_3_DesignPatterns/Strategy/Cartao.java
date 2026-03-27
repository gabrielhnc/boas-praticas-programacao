package Atividade_3_DesignPatterns.Strategy;

public class Cartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via CARTÃO: R$%.2f", valor);
    }
}
