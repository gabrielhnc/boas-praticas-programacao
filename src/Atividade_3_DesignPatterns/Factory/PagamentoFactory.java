package Atividade_3_DesignPatterns.Factory;

import Atividade_3_DesignPatterns.Strategy.*;

public class PagamentoFactory {

    public static Pagamento criarPagamento(String tipo) {

        if (tipo.equalsIgnoreCase("pix")) {
            return new Pix();
        } else if (tipo.equalsIgnoreCase("cartao")) {
            return new Cartao();
        } else if (tipo.equalsIgnoreCase("boleto")) {
            return new Boleto();
        }

        throw new IllegalArgumentException("Tipo de pagamento inválido!");
    }
}