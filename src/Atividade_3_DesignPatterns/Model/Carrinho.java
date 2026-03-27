package Atividade_3_DesignPatterns.Model;

import Atividade_3_DesignPatterns.Strategy.Pagamento;

public class Carrinho {
    private Pagamento tipo;

    public void setTipo(Pagamento tipo) {
        this.tipo = tipo;
    }

    public void finalizarCompra(double valor) {
        if (tipo == null) {
            System.out.println("Escolha uma forma de pagamento!");
            return;
        }
        tipo.pagar(valor);
    }
}