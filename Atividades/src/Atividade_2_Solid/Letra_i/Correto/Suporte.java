package Atividade_2_Solid.Letra_i.Correto;

import Atividade_2_Solid.Letra_i.Correto.Interfaces.AtendimentoCliente;

public class Suporte implements AtendimentoCliente {

    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente no suporte");
    }
}