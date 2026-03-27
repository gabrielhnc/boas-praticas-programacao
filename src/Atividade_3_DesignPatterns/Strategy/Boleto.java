package Atividade_3_DesignPatterns.Strategy;

public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via BOLETO: R$%.2f", valor);
    }
}
