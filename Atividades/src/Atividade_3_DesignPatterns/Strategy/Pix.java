package Atividade_3_DesignPatterns.Strategy;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via PIX: R$%.2f", valor);
    }
}
